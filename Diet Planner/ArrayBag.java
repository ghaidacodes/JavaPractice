public class ArrayBag<T> implements BagInterface<T>{
    private final T[] dataBag;
    private static final int DEFAULT_CAPACITY = 25; // default array size
    private int numberOfEntries; // current no. of entries in array
    public ArrayBag () {
        this(DEFAULT_CAPACITY);
    }
    public ArrayBag (int capacity) {
        numberOfEntries = 0;
        /** the cast is safe because the
         new array contains null entries */

        T [] tempBag = (T[]) new Object[capacity];
        dataBag = tempBag;
        //  dataBag = (T []) new Object [capacity];
    } // end constructor
    public boolean add(T newEntry) {
        if (isFull())
            return false;
        else {
            dataBag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
    }
    public T remove() {
        if (!isEmpty()) {
            T removedEntry = dataBag[numberOfEntries-1];
            dataBag[numberOfEntries-1] = null; // necessary?
            numberOfEntries--;
            return removedEntry;
        } else
            return null;
    }
    public boolean remove(T anEntry) {
        int index = getIndexOf(anEntry);
        T result = removeAtIndex(index);
        return anEntry.equals(result);
    }
    public void clear() {
        numberOfEntries = 0;
    }
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }
    public boolean isFull() {
        return dataBag.length == numberOfEntries;
    }
    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        for (int index = 0; index < numberOfEntries; index++) {
            if (anEntry.equals(dataBag[index])) {
                counter++;
            } // end if
        } // end for
        return counter;
    } // end getFrequencyOf

    public boolean contains(T anEntry) {
        for (int i=0; i<dataBag.length; i++) {
            if (anEntry.equals(dataBag[i])) {
                return true;
            }
        }
        return false;
    }
    public int getCurrentSize() {
        return numberOfEntries;
    }
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfEntries];

        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = dataBag[index];
        } // end for

        return result;
    }
    private int getIndexOf(T anEntry) {
        int found = -1;
        for (int i=0; i<numberOfEntries; i++) {
            if (dataBag[i].equals(anEntry)) {
                found = i;
                break;
            }
        }
        return found;
    }
    private T removeAtIndex(int givenIndex) {
        if (isEmpty() || givenIndex < 0 ||
                givenIndex >= numberOfEntries)
            return null;
        T entry = dataBag[givenIndex];
        dataBag[givenIndex] = dataBag[numberOfEntries-1];
        dataBag[numberOfEntries-1] = null;
        numberOfEntries--;
        return entry;
    }
}
