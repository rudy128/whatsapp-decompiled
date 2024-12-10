package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: X.0a7  reason: invalid class name and case insensitive filesystem */
public final class C06950a7 implements Map.Entry, AnonymousClass3MS {
    public Object A00;
    public final Object A01;
    public final /* synthetic */ AnonymousClass08S A02;

    public C06950a7(AnonymousClass08S r2) {
        this.A02 = r2;
        Map.Entry entry = r2.A01;
        C18070vi.A0b(entry);
        this.A01 = entry.getKey();
        Map.Entry entry2 = r2.A01;
        C18070vi.A0b(entry2);
        this.A00 = entry2.getValue();
    }

    public Object setValue(Object obj) {
        AnonymousClass08S r0 = this.A02;
        C06960a8 A002 = r0.A00();
        if (A002.A00() == r0.A00) {
            Object value = getValue();
            A002.put(getKey(), obj);
            this.A00 = obj;
            return value;
        }
        throw new ConcurrentModificationException();
    }

    public Object getKey() {
        return this.A01;
    }

    public Object getValue() {
        return this.A00;
    }
}
