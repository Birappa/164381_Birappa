package com.date.service.supp;

import com.date.service.DateDifferenceProvider;

public class TestDateDifferenceProvider {
	/*static int count;
	public TestDateDifferenceProvider() {
		// TODO Auto-generated constructor stub
		count=0;
		count++;
	}*/
	public static void main(String[] args) {
		/*MyDate startDate=new MyDate(20, 11, 2018);
		MyDate endDate=new MyDate(20, 11, 2018);
		int actualDiff=0;*/
		
		/*TestDateDifferenceProvider obj1=new TestDateDifferenceProvider();
		System.out.println(count);
		TestDateDifferenceProvider obj2=new TestDateDifferenceProvider();
		System.out.println(count);*/
		
		DateDifferenceProvider provider=new DateDifferenceProvider();
		TestRecord[] testRecords=new TestRecord[15];
	    testRecords[0]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(06, 04, 2011), 0); 
	    testRecords[1]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(18, 04, 2011), 12);
	    testRecords[2]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011), 42);
	    testRecords[3]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73);
	    testRecords[4]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011), 256);
	    testRecords[5]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2012), 622);
	    testRecords[6]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2013), 987);
	    testRecords[7]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113), 37511);
	    testRecords[8]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2413), 147084);
	    testRecords[9]=new TestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2813), 293181);
	    testRecords[10]=new TestRecord(new MyDate(06, 01, 2011), new MyDate(06, 03, 2011), 59);
	    testRecords[11]=new TestRecord(new MyDate(06, 01, 2012), new MyDate(06, 03, 2012), 60);
	    testRecords[12]=new TestRecord(new MyDate(06, 02, 2012), new MyDate(06, 03, 2012), 29);
	    testRecords[13]=new TestRecord(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012), 298);
	    testRecords[14]=new TestRecord(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012), 304);
	    int testCaseNumber=0;
	    for(TestRecord testRecord:testRecords){
	    	testCaseNumber++;
	    	int calculatedDiff=provider.getDateDifference(testRecord.getStartDate(), testRecord.getEndDate());
			if(testRecord.getActualDiff()==calculatedDiff)
				System.out.println("Test Case"+testCaseNumber+" is Passed");
			else
				System.err.println("Test Case"+testCaseNumber+" is Failed"+" actualDiff : "+testRecord.getActualDiff()+" calculatedDiff : "+calculatedDiff);
			
	    }
		
	}

}
