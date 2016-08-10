package com.asavin.someProject;

/**
 * @author asavin
 */
public interface Collectionable {
    int size(int[] simpleArray);
    /*
    * @return arrayInString example[1,2,3]()->"{1,2,3}"
    * */
    String toString(int[] simpleArray);

    void addToBegin(int[] simpleArray,int element);
    void addToEnd(int[] simpleArray,int element);
    void addToPos(int[] simpleArray,int element,int position);

    /*
    * @return deletedElement
    * */
    int deleteBegin(int[] simpleArray);
    int deleteEnd(int[] simpleArray);
    int deletePos(int[] simpleArray,int pos);
    /**
     *@return foundElementPosition or ifElement!found -1
     */
    int findElement(int[] simpleArray,int element);
    /**
     *@return sorted array
     */
    int[]sort(int[]simpleArray,boolean byIncrease);
}
