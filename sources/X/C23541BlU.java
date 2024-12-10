package X;

import java.io.Serializable;

/* renamed from: X.BlU  reason: case insensitive filesystem */
public abstract class C23541BlU extends C23542BlV implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient C201110w map;
    public final transient int size;

    public int size() {
        return this.size;
    }

    public C23541BlU(C201110w r1, int i) {
        this.map = r1;
        this.size = i;
    }

    public C201110w asMap() {
        return this.map;
    }
}
