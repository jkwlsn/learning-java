class Box<T> {
    // Generic class accepts any type of data
    T value;

    public void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}
