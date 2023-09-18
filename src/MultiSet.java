public interface MultiSet {
    public boolean add(long item);
    public void remove(long item);
    public boolean contains(long item);
    public boolean is_empty();
    public long count(long item);
    public long size();
}
