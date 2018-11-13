var count=0;

var obj={
		calc:function()
			{	
				for(i=0;i<5;i++){
				if(bill_obj[i]<50)
				tip_obj[i]=bill_obj[i]*0.2;
				else if(bill_obj[i]>=50 && bill_obj[i]<=200)
				tip_obj[i]=bill_obj[i]*0.15;
				if(bill_obj[i]>200)
				tip_obj[i]=bill_obj[i]*0.1;
				else
				alert("Enter proper value");
				}
			}
bill_arr=new Array(5);
var tip_obj=new Array(5);

function repeat()
{
	if(count<6)
	{
		bill_obj[count]=parseInt(document.getElementById("bill").value);
		
		count++;
			
	}	