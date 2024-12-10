package X;

/* renamed from: X.Bxv  reason: case insensitive filesystem */
public enum C24240Bxv {
    VOID(r6, r6, (Class) null),
    INT(r7, r8, 0),
    LONG(Long.TYPE, Long.class, C17890vO.A0L()),
    FLOAT(Float.TYPE, Float.class, BE7.A0W()),
    DOUBLE(Double.TYPE, Double.class, AnonymousClass8BV.A0Q()),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(r16, r16, ""),
    BYTE_STRING(r19, r19, DSP.A00),
    ENUM(r7, r8, (Class) null),
    MESSAGE(r26, r26, (Class) null);
    
    public final Class zzlh;
    public final Class zzli;
    public final Object zzlj;

    /* access modifiers changed from: public */
    C24240Bxv(Class cls, Class cls2, Object obj) {
        this.zzlh = cls;
        this.zzli = cls2;
        this.zzlj = obj;
    }
}
