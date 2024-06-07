
package LabArray;

class SimpleArray
{
    private long[] a; 

    public SimpleArray(int size) // constructor
    { a = new long[size]; } // create array


    public void setElem(int index, long value) // set value
    { a[index] = value; }


    public long getElem(int index) // get value
    { return a[index]; }

    // (1) เมธอด findMax()
    public int findMax(int nElems) {
        if (nElems == 0) {
            return -1; // กรณี array ว่างเปล่า
        }

        int maxIndex = 0; // เริ่มต้นที่ index 0
        for (int i = 1; i < nElems; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i; // อัปเดต maxIndex ถ้าเจอค่าที่ใหญ่กว่า
            }
        }
        return maxIndex;
    }// TODO: (1) add a method findMax(int nElems) to return an index of the max element

    // (2) เมธอด removeMax()
    public Long removeMax(int nElems) {
        if (nElems == 0) {
            System.out.println("Cannot find max. Array is empty.");
            return null; // กรณี array ว่างเปล่า
        }

        int maxIndex = findMax(nElems);
        long maxValue = a[maxIndex]; // เก็บค่าสูงสุดก่อนลบ

        // เลื่อนข้อมูลไปข้างหน้าเพื่อแทนที่ตำแหน่ง maxIndex
        for (int i = maxIndex; i < nElems - 1; i++) {
            a[i] = a[i + 1];
        }
        nElems--; // ลดจำนวนข้อมูลลง 1

        System.out.println(maxValue + " has been removed.");
        return maxValue; // คืนค่าที่ถูกลบ
    }// TODO: (2) add a method removeMax() to remove the max element and shift all the elements up



} // end class LowArray
