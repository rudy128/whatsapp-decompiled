package X;

/* renamed from: X.9Ix  reason: invalid class name and case insensitive filesystem */
public enum C179679Ix {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    /* access modifiers changed from: public */
    C179679Ix(String str) {
        this.extension = str;
    }

    public String toString() {
        return this.extension;
    }
}
