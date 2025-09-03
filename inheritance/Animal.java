abstract class Animal {
    private int vetId;

    public abstract void noise();

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public void getVetId() {
        System.out.println(this.vetId);
    }
}
