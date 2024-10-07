public interface BagInterface <T> {
    /**
     An interface that describes the operations of a bag of objects.
     @author Frank M. Carrano
     */

    /** Get the current number of entries in this bag.
     @return the integer number of entries currently in the bag
     */
    public int getCurrentSize ();

    /** Check if bag is full.
     @return true if the bag is full, or false if not */
    public boolean isFull ();

    /** Check if bag is empty.
     @return true if the bag is empty, or false if not */
    public boolean isEmpty ();

    /** Add a new entry to this bag.
     @param newEntry the object to be added as a new entry
     @return true if the addition is successful, or false if not */
    public boolean add (T newEntry);

    /** Remove one unspecified entry from this bag, if possible.
     @return either the removed entry if successful, or null */
    public T remove ();

    /** Remove one occurrence of a given entry from this bag, if possible.
     @param anEntry the entry to be removed
     @return true if the removal was successful, or false if not */
    public boolean remove (T anEntry);

    /** Remove all entries from this bag. */
    public void clear ();

    /** Count the number of times a given entry appears in this bag.
     @param anEntry the entry to be counted
     @return the number of times anEntry appears in the bag */
    public int getFrequencyOf (T anEntry);

    /** Test whether this bag contains a given entry.
     @param anEntry the entry to locate
     @return true if the bag contains anEntry, or false otherwise */
    public boolean contains (T anEntry);

    /** Create an array of all entries that are in this bag.
     @return a newly allocated array of all the entries in the bag */
    public T [] toArray ();
}
