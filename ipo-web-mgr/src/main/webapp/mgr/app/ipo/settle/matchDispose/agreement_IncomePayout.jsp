<%@ page contentType="text/html;charset=GBK"%>
<%@ include file="/mgr/public/includefiles/allincludefiles.jsp"%>
<%--������Ʒ�Ƿ�˰ ������������ֱ��ʹ�� 1Ϊ����˰ 0Ϊ��˰ --%>
<c:set value="${entity.taxIncluesive}" var="WT" scope="page"/>
<html>
  <head>
    <title>���򷽻�����Ϣ</title>
    
    <link rel="stylesheet" href="${skinPath }/css/validationengine/validationEngine.jquery.css" type="text/css" />
	<link rel="stylesheet" href="${skinPath }/css/validationengine/template.css" type="text/css" />
	<script src="${publicPath }/js/jquery-1.6.min.js" type="text/javascript"></script>
	<script src="${publicPath }/js/validationengine/languages/jquery.validationEngine-zh_CN.js" type="text/javascript" charset="GBK"></script>
	<script src="${publicPath }/js/validationengine/jquery.validationEngine.js" type="text/javascript" charset="GBK"></script>
    <script type="text/javascript">

	    function checkNum()
		{
			if(frm.percent.value!='')
			{
				if(Number(frm.percent.value)){
					var percentMoney = (frm.totalMoney.value)*0.01*(frm.percent.value);
					frm.thisPayMent.value = percentMoney.toFixed(2);
				}
			}else{
				var val= frm.thisPayMent.value
				if(val.indexOf(".") != -1 && val.substring(val.indexOf(".")+1,val.length).length>2){
					return "* С�������Ϊ2λ";
				}
			}
		}
	
	  jQuery(document).ready(function() {
			
		  $("#frm").validationEngine('attach');
			
			$("#update").click(function(check) {
				if ($("#frm").validationEngine('validate')) {
					if(Number(frm.thisPayMent.value)==0){
						alert("����������");
					}else{
						var vaild = affirm("��ȷ��Ҫ������");
						if (vaild == true) {
							$("#frm").validationEngine('attach');
							//$('#frm').attr('action', 'action');
						    $("#frm").submit();
						    //document.getElementById("update").disabled=true;
						}
					}
			}})
	});
    </script>
    
  </head>
  <body>
  <form id="frm" enctype="multipart/form-data" method="post" targetType="hidden" action="${basePath}/timebargain/settle/matchDispose/incomePayout.action?entity.matchID=${entity.matchID}" >
    <div class="div_cx">
	  <table border="0" width="100%" align="center">
	    <tr>
		  <td>
		    <div class="warning">
			  <div class="content">
			          ��ܰ��ʾ :������ԡ�${entity.matchID}�����򷽻�����Ϣ
			  </div>
			</div>
		  </td>
		</tr>
		<tr>
		  <td>
		    <table border="0" width="100%" align="center">
			  <tr>
			  
			    <td>
				  <div class="div_cxtj">
				    <div class="div_cxtjL"></div>
					<div class="div_cxtjC">
					   ���򷽻�����Ϣ
					</div>
					<div class="div_cxtjR"></div>
				  </div>
				  <div style="clear: both;"></div>
				  <div>
				    <table border="0" cellspacing="0" cellpadding="8" width="100%" align="center" class="table2_style">
					  <tr>
			            <td align="right">�򷽽����̴��룺</td>
						<td >
						  ${entity.firmID_B }&nbsp;
						</td>
					  </tr>
					  <tr>
			             <td align="right">��Ʒ���룺</td>
						<td>
						  ${entity.commodityID}&nbsp;
						</td>
					  </tr>
					  <tr>
					  <td align="right">����������</td>
						<td>
							${entity.quantity }&nbsp;
						</td>
					  </tr>
					  <tr>
			            <td align="right">�򷽽��ռۣ�</td>
						<td >
						  <fmt:formatNumber value="${entity.buyPrice }" pattern="#,##0.00"/>&nbsp;
						</td>
					  </tr>
					  <tr>
			            <td align="right">�򷽻�׼���</td>
						<td >
						  <fmt:formatNumber value="${entity.buyPayout_Ref }" pattern="#,##0.00"/>&nbsp;
						</td>
					  </tr>
					  <tr>
					  <td align="right">˰�ѣ�</td>
						<td>
							${entity.buyTax }&nbsp;
						</td>
					  </tr>
					  <tr>
					    <td align="right">
						  <b>������ˮ����</b>
						</td>
						<td >
						  <c:choose>
						    <c:when test="${(entity.buyPayout_Ref + entity.HL_Amount ) > buyBalance }">
<%-- 						    <c:when test="${(entity.buyPayout_Ref + entity.HL_Amount + entity.buyTax) > buyBalance }"> --%>
							  <font color="red"><fmt:formatNumber value="${entity.buyPayout_Ref + entity.HL_Amount }" pattern="#,##0.00"/></font>
<%-- 							  <font color="red"><fmt:formatNumber value="${entity.buyPayout_Ref + entity.HL_Amount + entity.buyTax }" pattern="#,##0.00"/></font> --%>
						    </c:when>
						    <c:otherwise>
							  <fmt:formatNumber value="${entity.buyPayout_Ref + entity.HL_Amount  }" pattern="#,##0.00"/>
<%-- 							  <fmt:formatNumber value="${entity.buyPayout_Ref + entity.HL_Amount + entity.buyTax }" pattern="#,##0.00"/> --%>
						    </c:otherwise>
					      </c:choose>
					      &nbsp;
						</td>
					  </tr>
					  <tr>
					    <td align="right">
						  <b>�����򷽻��</b>
						</td>
						<td>	
						  <fmt:formatNumber value="${entity.buyPayout  }" pattern="#,##0.00"/>
<%-- 						  <fmt:formatNumber value="${entity.buyPayout + entity.buyTax }" pattern="#,##0.00"/> --%>
						&nbsp;
						</td>
					  </tr>
					  <tr>
			            <td align="right">������ˮ�����ٷֱȣ�</td>
						<td>
						 <input class="validate[custom[number],funcCall[checkNum]]" id="percent" name="percent" size="12" /><font color="red">%</font>
						<input type="hidden" name="totalMoney" value="${entity.buyPayout_Ref+entity.HL_Amount }">
<%-- 						<input type="hidden" name="totalMoney" value="${entity.buyPayout_Ref+entity.HL_Amount+entity.buyTax }"> --%>
						</td>
					  </tr>
					  <tr>
			            <td align="right"><span class='required'>*</span>�����ջ��</td>
						<td>
						 <input class="validate[required,custom[number],funcCall[checkNum]]" id="thisPayMent" name="thisPayMent" size="12" />
						</td>
					  </tr>
					</table>
				  </div>
				</td>
				</tr>
			</table>
		  </td>
		</tr>
		
		
	  </table>
	</div>
	
	<div class="tab_pad">
	  <table border="0" cellspacing="0" cellpadding="10" width="100%" align="center">
	    <tr align="center">   
		  <td>
			
						<rightButton:rightButton name="����" onclick="" className="btn_sec"
							action="/timebargain/settle/matchDispose/incomePayout.action" id="update" ></rightButton:rightButton>
		  </td>
	    </tr>
	  </table>
    </div>
	</form>	
  </body>
</html>
<%@ include file="/mgr/public/jsp/footinc.jsp"%>