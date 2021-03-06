<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/mgr/public/includefiles/allincludefiles.jsp"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/jquery-easyui/themes/default/easyui.css"> 
        <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/static/jquery-easyui/themes/icon.css"> 
        <link rel="stylesheet" href="${skinPath }/css/validationengine/validationEngine.jquery.css" type="text/css" />
		<link rel="stylesheet" href="${skinPath }/css/validationengine/template.css" type="text/css" />
		<link rel="stylesheet" href="${skinPath }/ecside/css/ecside_style.css" type="text/css" />
		<style type="text/css">input {line-height: 14px;}    td {padding-bottom: 3px;}</style>
        <script src="<%=request.getContextPath()%>/static/jquery/jquery-1.8.0.min.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/static/jquery-easyui/jquery.easyui.min.js"  type="text/javascript"></script>
		<title>品种</title>
		<style type="text/css">
			legend{font-weight:bold;}
		</style>
		<script type="text/javascript"> 

function addBreed(){
	var breedid=$("#breedid").val();
	var bname=$("#bname").val();
	var concurrency=$("#contractcurrency").val();
    var publishalgr=$("#publishalgr").val();
    var tradealgr=$("#tradealgr").val();
	var flag= $('#frm').form('validate');
	if(bname!=''&&concurrency!= ''&&publishalgr!= ''&&tradealgr!= ''&&flag==true){
            	 $.ajax({  
        			 type: 'GET',  //
        		      url: "<%=request.getContextPath()%>/BreedController/findExsitIds",  
        		     contentType: "application/json; charset=utf-8", 
        		     data:{"breedid":breedid,"randnum":Math.floor(Math.random()*1000000)},  
        			 dataType: 'json',  
        		     success : function(data, stats) { 
        			           if(data=='0'){
        			        	   alert("该品种已配置，请选择其他品种！")
        			           }
                               if(data=='1'){
                            	   $.ajax({ 
                            		   cache:false,
                                       type: "post",  
                                       url: "<%=request.getContextPath()%>/BreedController/addBreed",       
                                       data: $("#frm").serialize(),      
                                       success: function(data) { 
                                    	   if(data=='true'){
                                           alert("添加成功！"); 
                                           returntoList();
                                    	   }else{
                                    		   alert("系统异常，请联系管理员");  
                                    	   }
                                       },  
                                       error: function(data) {  
                                           alert("系统异常，请联系管理员");  
                                       }  
                                   }) 
        			           }
                               if(data=='2'){
                            	   alert("系统内部异常,请联系管理员")
        			           }
        			        }    
        				});
            }
			else{
					alert("所有参数必填！");
		}
}
		
function updateBreed(){
	
	var bname=$("#bname").val();
	var concurrency=$("#contractcurrency").val();
	 var tradealgr=$("#tradealgr").val();
	var publishalgr=$("#publishalgr").val();
	var flag= $('#frm').form('validate');
	if(bname!=''&&concurrency!= ''&& publishalgr!= ''&&tradealgr!= ''&&flag==true){
                            	   $.ajax({ 
                            		   cache:false,
                                       type: "post",  
                                       url: "<%=request.getContextPath()%>/BreedController/updateBreed",       
                                       data: $("#frm").serialize(),      
                                       success: function(data) { 
                                    	   if(data=='true'){
                                           alert("修改成功！"); 
                                           returntoList();
                                    	   }else{
                                    		   alert("系统异常，请联系管理员");  
                                    	   }
                                       },  
                                       error: function(data) {  
                                           alert("系统异常，请联系管理员");  
                                       }  
                                   }); 
            }
			else{
					alert("所有参数必填！");
		}
}

function returntoList(){
	var backUrl="<%=request.getContextPath()%>/IpoController/CommodityManage?randnum="+Math.floor(Math.random()*1000000);
	document.location.href = backUrl;
}
		
function onlyNumberInput(){
	 if (event.keyCode<46 || event.keyCode>57 || event.keyCode == 47){
		    event.returnValue=false;
	 }
}

function changeTail(){
	$("#tail").html($("#deliveryunit").val());
}

function on_change(){
	if (document.getElementById("publishalgr").value == "1") {
		$("#dealerpubcharatioPercent").show();
		$("#mktdeapubcharatioPercent").show();
		$("#publishercharatioPercent").show();
		$("#mktpubcharatioPercent").show();
	}else {
		$("#dealerpubcharatioPercent").hide();
		$("#mktdeapubcharatioPercent").hide();
		$("#publishercharatioPercent").hide();
		$("#mktpubcharatioPercent").hide();
	}
}

function on_tchange(){
	if (document.getElementById("tradealgr").value == "1") {
		$("#buyPercent").show();
		$("#sellPercent").show();
		$("#mktbuyPercent").show();
		$("#mktsellPercent").show();
	}else {
		$("#buyPercent").hide();
		$("#sellPercent").hide();
		$("#mktbuyPercent").hide();
		$("#mktsellPercent").hide();
	}
}



function setSortName(value) {
	var breedslist =<%=request.getAttribute("breedlist") %>; 
	 for(var o in breedslist){  
	        if (value == breedslist[o].breedname ) {
				$("#breedid").val(breedslist[o].breedid);
				$("#breedname").val(breedslist[o].breedname);
				$("#sortid").val(breedslist[o].categoryid);
				$("#contractfactorname").val(breedslist[o].unit);
				$("#span_contractFactor").html("("+breedslist[o].unit+ "/批)");
				break;
		}
	 }  
}
	
function changeContractor(value){
	if(value=='1'){
		$("#quote").html("元");
	}
	if(value=='2'){
		$("#quote").html("美元");
	}
}
</script>
</head>
<body leftmargin="14" topmargin="0">
<div class="warning">
		<div class="title font_orange_14b">温馨提示 : 品种<c:if test="${crud == 'create'}">添加 </c:if><c:if test="${crud == 'update'}">修改 </c:if> </div>
		<div class="content" style="color: red">手续费算法：百分比按货款计算手续费，绝对值按数量计算手续费  </div>
	</div>
	<table  style="border:0;width:100%" >
		<tr>
			<td valign="top">
				<form id="frm" name="frm" action="" method="POST">
				<fieldset>
				<legend class="common"><b>设置品种信息</b></legend>
				<span id="baseinfo9">
				<table style="border:0;width:850px" align="center"  class="common" cellpadding="0" cellspacing="2">
					<!-- 基本信息 -->
        				<tr class="common">
							<td colspan="4">
					      		<fieldset>
					          	<legend>
					          	基本信息
<!-- 					           	<table cellspacing="0" cellpadding="0" border="0" width="800" class="common"> -->
<!-- 					            	<col width="55"></col><col></col><col width="6"></col> -->
<!-- 					               	<tr> -->
<!-- 					                 	<td><b>基本信息</b></td> -->
<!-- 					                    <td><hr width="100%" class="pickList"/></td> -->
<!-- 					            	</tr> -->
<!-- 					         	</table> -->
					         	</legend>
								<span id="baseinfo">
								<table cellSpacing="0" cellPadding="0" width="800" border="0" align="left" class="common">
        							<tr>
        			 					<td align="right" width="98"><span class="required">品种名称：</span></td>
	      								<td style="white-space:nowrap;">
	      								   <c:if test="${crud == 'create'}">
		      									<select id="bname" name="breedname" style="width:100" class="validate[required]" onchange="setSortName(this.value)">
								            		<option value="">请选择</option>
                                                    <c:forEach var="mbreed" items="${Mlist}">
                                                      <option value="${mbreed.breedname}">${mbreed.breedname}</option>
                                                    </c:forEach>
								            	</select>
								            </c:if> 
								            <c:if test="${crud == 'update'}">
								            	<input id="breedname" name="breedname" value="${entity.breedname }" style="width: 100;background-color: #C0C0C0" class="input_text" size="10" readonly="readonly"/>
								            </c:if>
							            	<input id="sortid" type="hidden" name="sortid" value="${entity.sortid }" />
		          							<span class="required">*</span>
		          						</td>
		          						<td align="right" width="90"><span class="required">品种代码：</span></td>     
            							<td> 
            							<input id="breedid" type="text" name="breedid" value="${entity.breedid }" style="width: 100;background-color: #C0C0C0;" readonly="readonly"/>
										   <span class="required">*</span>   
										</td>
										<td align="right" width="90">报价货币：</td>     
            							<td> 
            							<select id="contractcurrency" name="contractcurrency" style="width:100" onchange="changeContractor(value)">
												<option value=""></option>
											    <option value="1" <c:if test="${entity.contractcurrency==1 }">selected</c:if>>元</option>
												<option value="2" <c:if test="${entity.contractcurrency==2 }">selected</c:if>>美元</option>
										   </select> 
										   <span class="required">*</span>   
										</td>
							        </tr>  
								</table >
								</span>
						    	</fieldset>
							</td>
						</tr>
						<!-- 参数信息 -->
        				<tr class="common">
							<td colspan="4">
					      		<fieldset>
					       		<legend>
<!-- 					        	<table cellspacing="0" cellpadding="0" border="0" width="800" class="common"> -->
<!-- 					           		<col width="55"></col><col></col><col width="6"></col> -->
<!-- 					         		<tr> -->
<!-- 					              		<td><b>基本参数</b></td> -->
<!-- 					                    <td><hr width="100%" class="pickList"/></td> -->
<!-- 					             	</tr> -->
<!-- 					         	</table> -->
									基本参数
					       		</legend>
								<span id="baseinfo2">
								<table cellSpacing="0" cellPadding="0" width="790" border="0" align="left" class="common">   
									<tr>
        								<input type="hidden" id="cmdtyPrefix"/>   
        	  							<td align="right">&nbsp;&nbsp;报价单位：</td>
            							<td><span id="quote"></span>/<input id="contractfactorname" name="contractfactorname" value="${entity.contractfactorname }"
            								class="easyui-validatebox textbox" data-options="required:true,readonly:true,missingMessage:'必填项'"  style="width: 100; background-color: C0C0C0"  readonly="readonly"/>          
			  								<span class="required">&nbsp;</span>  
            							</td>    
        								<td align="right" ></td> 
            							<td> 
            							</td>
            							<td align="right">T+N交易天数：</td>
										<td>
										<input type="text" id="tradedays" name="tradedays" value="${entity.tradedays }" 
			  								 class="easyui-numberbox" data-options="required:true,missingMessage:'请输入1-9的整数',min:0,max:9"  style="ime-mode:disabled; width: 100" />          
										<span class="required">*</span>    
										</td>
        							</tr>
	 							</table >
								</span>
								</fieldset>
						 	</td>
						</tr>

						<tr class="common">
							<td colspan="4">
					      		<fieldset>
					       		<legend>
<!-- 					        	<table cellspacing="0" cellpadding="0" border="0" width="800" class="common"> -->
<!-- 					           		<col width="55"></col><col></col><col width="6"></col> -->
<!-- 					         		<tr> -->
<!-- 					              		<td><b>发行参数</b></td> -->
<!-- 					                    <td><hr width="100%" class="pickList"/></td> -->
<!-- 					                    <td ></td> -->
<!-- 					             	</tr> -->
<!-- 					         	</table> -->
									发行参数
					       		</legend>
								<span id="baseinfo2">
								<table cellSpacing="0" cellPadding="0" width="790" border="0" align="left" class="common">   
									<tr>
        	  							<td align="right">最小申购数量：</td>
            							<td><input id="minapplynum" name="minapplynum" value="${entity.minapplynum }"
            								 class="easyui-numberbox" data-options="required:true,missingMessage:'请填入10位以内的正整数！',min:0,max:9999999999"  style="ime-mode:disabled;width: 100"/>          
            							<span class="required">*</span>   
            							</td>    
        								<td align="right" >最大申购数量：</td> 
            							<td> 
			  								<input id="maxapplynum" name="maxapplynum"  value="${entity.maxapplynum }"
			  									style="ime-mode:disabled; width: 100"  class="easyui-numberbox" data-options="required:true,missingMessage:'请填入32位以内的正整数！',min:0"/>
            							<span class="required">*</span>   
            							</td>
            							<td align="right">最小申购变动量：</td>
										<td>
										<input id="minapplyquamove" name="minapplyquamove"  value="${entity.minapplyquamove }"
			  									style="ime-mode:disabled; width: 100"  class="easyui-numberbox" data-options="required:true,missingMessage:'请填入8位以内的正整数！',min:0,max:99999999"/>
										<span class="required">*</span>   
										</td>
        							</tr>
							        <tr>
							            <td align="right" >发行手续费算法：</td>
							            <td >
											<select id="publishalgr" name="publishalgr" style="width:100" onchange="on_change()">
												<option value=""></option>
											    <option value="1" <c:if test="${entity.publishalgr==1 }">selected</c:if>>按百分比</option>
												<option value="2" <c:if test="${entity.publishalgr==2 }">selected</c:if>>按绝对值</option>
										   </select> <span class="required">*</span>            
							            </td>        
							            <td align="right">交易商发行手续费比例：</td>
							            <td>
			  								<input id="dealerpubcharatio" name="dealerpubcharatio" maxlength="10" value="${entity.dealerpubcharatio }"
			  									style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
			  								<span id="dealerpubcharatioPercent">%</span><span class="required">*</span>         
            							</td>
            							<td align="right">交易商发行手续费市场留存比例：</td>
            							<td>
											<input id="mktdeapubcharatio" name="mktdeapubcharatio" maxlength="10" value="${entity.mktdeapubcharatio }"
												style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
											<span id="mktdeapubcharatioPercent">%</span><span class="required">*</span>          
								      	</td>
								      	<td>&nbsp;</td>
								      	<script type="text/javascript">
							            	if ("${entity.publishalgr}" == "1"){$("#dealerpubcharatioPercent").show();$("#mktdeapubcharatioPercent").show();} else {$("#dealerpubcharatioPercent").hide();$("#mktdeapubcharatioPercent").hide();}
							            </script>
        							</tr> 
									<tr>
										<td align="right"></td>
            							<td>
            							</td>
            							<td align="right">发行商发行手续费比例：</td>
            							<td>
			  								<input type="text" id="publishercharatio" name="publishercharatio" value="${entity.publishercharatio }" 
			  									class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"  style="ime-mode:disabled; width: 100" />  
			  								<span id="publishercharatioPercent">%</span><span class="required">*</span>       
            							</td>
            							<td align="right">发行商发行手续费市场留存比例：</td>
										<td>
										<input type="text" id="mktpubcharatio" name="mktpubcharatio" value="${entity.mktpubcharatio }" 
			  									class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"  style="ime-mode:disabled; width: 100" />          
										<span id="mktpubcharatioPercent">%</span><span class="required">*</span>   
										</td>
										<td>&nbsp;</td>
								      	<script type="text/javascript">
							            	if ("${entity.publishalgr}" == "1"){$("#publishercharatioPercent").show();$("#mktpubcharatioPercent").show();} else {$("#publishercharatioPercent").hide();$("#mktpubcharatioPercent").hide();}
							            </script>
         							</tr>
	 							</table >
								</span>
								</fieldset>
						 	</td>
						</tr>
						
						<tr class="common">
							<td colspan="4">
					      		<fieldset>
					       		<legend>
<!-- 					        	<table cellspacing="0" cellpadding="0" border="0" width="800" class="common"> -->
<!-- 					           		<col width="55"></col><col></col><col width="6"></col> -->
<!-- 					         		<tr> -->
<!-- 					              		<td><b>交易参数</b></td> -->
<!-- 					                    <td><hr width="100%" class="pickList"/></td> -->
<!-- 					             	</tr> -->
<!-- 					         	</table> -->
									交易参数
					       		</legend>
								<span id="baseinfo2">
								<table cellSpacing="0" cellPadding="0" width="790" border="0" align="left" class="common">   
								    <tr>
        	  							<td align="right">申购手续费算法：</td>
            							<td>
            							<select id="tradealgr" name="tradealgr" style="width:100" onchange="on_tchange()">
												<option value=""></option>
											    <option value="1" <c:if test="${entity.tradealgr==1 }">selected</c:if>>按百分比</option>
												<option value="2" <c:if test="${entity.tradealgr==2 }">selected</c:if>>按绝对值</option>
										   </select><span class="required">*</span>  
            							</td>
            							<td align="right" >买入：</td> 
            							<td> 
			  								<input id="buy" name="buy"  value="${entity.buy }"
			  									style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
            							<span id="buyPercent">%</span> <span class="required">*</span> 
            							</td>    
        								<td align="right">买方手续费市场留存比例：</td>
										<td>
										<input id="mktbuyfeeradio" name="mktbuyfeeradio"  value="${entity.mktbuyfeeradio }"
			  									style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
										<span id="mktbuyPercent">%</span><span class="required">*</span> 
										</td>
        							</tr>
							        <tr>
							            <td align="right" >仓储日租金标准：</td>
							            <td >
											<input id="warehousedailyrent" name="warehousedailyrent" value="${entity.warehousedailyrent }" 
											style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
										    <span class="required">*</span>         
							            </td>        
            							<td align="right">日托管费标准：</td>
            							<td>
											<input id="trusteedailyrent" name="trusteedailyrent" value="${entity.trusteedailyrent }" 
											style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
										    <span class="required">*</span>       
								      	</td>
								      	<td align="right"></td>
							            <td>
            							</td>
        							</tr> 
									<tr>
										<td align="right">日保险费标准：</td>
            							<td>
            							<input id="insurancedailyrent" name="insurancedailyrent" value="${entity.insurancedailyrent }" 
											style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
										    <span class="required">*</span>
            							</td>
            							<td align="right">免托管天数：</td>
										<td>
										<input type="text" id="freetrusteedays" name="freetrusteedays" value="${entity.freetrusteedays }" 
			  								style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'必填项',min:0,precision:0"   />          
										<span class="required">*</span> 
										</td>
										<td align="right"></td>
            							<td>
            							</td>
								      	<script type="text/javascript">
							            	if ("${entity.tradealgr}" == "1"){$("#buyPercent").show();$("#sellPercent").show();$("#mktbuyPercent").show();$("#mktsellPercent").show();} else {$("#sellPercent").hide();$("#buyPercent").hide();$("#mktbuyPercent").hide();$("#mktsellPercent").hide();}
							            </script>
         							</tr>
	 							</table >
								</span>
								</fieldset>
						 	</td>
						</tr>
						
							<tr class="common">
							<td colspan="4">
					      		<fieldset>
					       		<legend>
<!-- 					        	<table cellspacing="0" cellpadding="0" border="0" width="800" class="common"> -->
<!-- 					           		<col width="55"></col><col></col><col width="6"></col> -->
<!-- 					         		<tr> -->
<!-- 					              		<td><b>交收参数</b></td> -->
<!-- 					                    <td><hr width="100%" class="pickList"/></td> -->
<!-- 					             	</tr> -->
<!-- 					         	</table> -->
								交收参数
					       		</legend>
								<span id="baseinfo2">
								<table cellSpacing="0" cellPadding="0" width="790" border="0" align="left" class="common">   
								    <tr>
        	  							<td align="right">交割单位：</td>
            							<td>
            							<input id="deliveryunit" name="deliveryunit"  value="${entity.deliveryunit }"
			  									style="width: 100" class="easyui-validatebox" data-options="required:true,missingMessage:'必填'" onblur="changeTail()"/>
											 <span class="required">如箱、吨等*</span>  
            							</td>
            							<td align="right" >交割与交易单位换算：</td> 
            							<td> 
			  								<input id="deliunittocontract" name="deliunittocontract"  value="${entity.deliunittocontract }"
			  									style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
            							<span class="required"><c:if test="${crud == 'update'}">批/<span id="tail"><c:out value="${entity.deliveryunit }"></c:out></span></c:if><c:if test="${crud == 'create'}">批/<span id="tail"></span></c:if>*</span> 
            							</td>    
        								<td align="right"></td> 
            							<td> 
			  							</td>
        							</tr>									
	 							</table >
								</span>
								</fieldset>
						 	</td>
						</tr>
						
						
						<tr class="common">
							<td colspan="4">
					      		<fieldset>
					       		<legend>
<!-- 					        	<table cellspacing="0" cellpadding="0" border="0" width="800" class="common"> -->
<!-- 					           		<col width="55"></col><col></col><col width="6"></col> -->
<!-- 					         		<tr> -->
<!-- 					              		<td><b>仓库参数</b></td> -->
<!-- 					                    <td><hr width="100%" class="pickList"/></td> -->
<!-- 					             	</tr> -->
<!-- 					         	</table> -->
								仓库参数
					       		</legend>
								<span id="baseinfo2">
								<table cellSpacing="0" cellPadding="0" width="790" border="0" align="left" class="common">   
								    <tr>
        	  							<td align="right">注册费用比例：</td>
            							<td>
            							<input id="registfeeradio" name="registfeeradio" value="${entity.registfeeradio }" 
											style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
									    %<span class="required">*</span>  
            							</td>
            							<td align="right" >注销费用比例：</td> 
            							<td> 
			  							<input id="cancelfeeradio" name="cancelfeeradio"  value="${entity.cancelfeeradio }"
			  								style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
            							%<span class="required">*</span> 
            							</td>    
        								<td align="right" >过户费用比例：</td> 
            							<td> 
            							<input id="transferfeeradio" name="transferfeeradio"  value="${entity.transferfeeradio }"
			  								style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
			  							%<span class="required">*</span> 
			  							</td>
        							</tr>
        							 <tr>
        	  							<td align="right">注册费市场留存比例：</td>
            							<td>
										<input id="mktregistfeeradio" name="mktregistfeeradio" value="${entity.mktregistfeeradio }" 
											style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
									    %<span class="required">*</span>   
            							</td>
            							<td align="right" >注销费市场留存比例：</td> 
            							<td> 
            							<input id="mktcancelfeeradio" name="mktcancelfeeradio" value="${entity.mktcancelfeeradio }" 
											style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:2"/>
									    %<span class="required">*</span>
            							</td>    
        								<td align="right" >提货单费用价格提前天数：</td> 
            							<td> 
            							 <input id="deliverycostbefore" name="deliverycostbefore" value="${entity.deliverycostbefore }" 
											style="ime-mode:disabled; width: 100" class="easyui-numberbox" data-options="required:true,missingMessage:'请填入正数',min:0,precision:0"/>
			  								 <span class="required">*</span> 
			  							</td>
        							</tr>										
	 							</table >
								</span>
								</fieldset>
						 	</td>
						</tr>
 
						<tr>
							<td colspan="4" height="3">	
						</td>
						</tr>                   
						<tr>
							<td colspan="4" align="center">
								<div class="div_gn">
								    <c:if test="${crud == 'create'}">
								    	<input type="button" value="添加" onclick="addBreed()" class="anniu_btn"  id="add"/>
								    </c:if>
								    <c:if test="${crud == 'update'}">
								    	<input type="button" value="提交" onclick="updateBreed()" class="anniu_btn"  id="update"/>
								    </c:if>
									&nbsp;&nbsp;
									<input type="button" value="返回" onclick="returntoList()" class="anniu_btn"  id="back"/>
								</div>
							</td>
						</tr>
					</table>
				</span>
			</fieldset>
			</form>
		</td>
	</tr>
</table>
</body>
</html>
