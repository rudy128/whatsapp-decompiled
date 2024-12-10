package X;

/* renamed from: X.Bzz  reason: case insensitive filesystem */
public enum C24364Bzz {
    VOID(r4, r4, (Class) null),
    INT(r5, r6, 0),
    LONG(Long.TYPE, Long.class, C17890vO.A0L()),
    FLOAT(Float.TYPE, Float.class, BE7.A0W()),
    DOUBLE(Double.TYPE, Double.class, AnonymousClass8BV.A0Q()),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(r16, r16, ""),
    BYTE_STRING(r17, r17, DSQ.A00),
    ENUM(r5, r6, (Class) null),
    MESSAGE(r24, r24, (Class) null);
    
    public final Class boxedType;
    public final Object defaultDefault;
    public final Class type;

    /* access modifiers changed from: public */
    C24364Bzz(Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }
}
