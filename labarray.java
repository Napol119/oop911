package LabArray;

class LabArray
{
    public static void main(String[] args)
    {
        SimpleArray arr;
        arr = new SimpleArray(100); 
        int nElems = 0; 
        int j; 

        arr.setElem(0, 77); 
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10; 

        for(j=0; j<nElems; j++) 
            System.out.print(arr.getElem(j) + " ");
        System.out.println(" ");

		System.out.println(arr.findMax(nElems));

		arr.removeMax(nElems);
    	nElems--;
		for(j=0; j<nElems; j++)
			System.out.print(arr.getElem(j) + " ");
		System.out.println(" ");


    }  
}
