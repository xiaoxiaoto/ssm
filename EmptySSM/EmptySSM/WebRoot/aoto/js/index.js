$(function (){
	$.ajax({
		   type: "POST",
		   url: rootPath+"/dept/insertdept",
		   dataType:"json",
		   async: false,
		   success: function(data){
			   eWarnTotal=data.eWarnTotal;
			   eWarnsPie=data.eWarnsPie;
			   warningStatistics(eWarnTotal);
		   }
		});
});