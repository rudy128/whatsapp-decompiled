package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.8fc  reason: invalid class name and case insensitive filesystem */
public class C167198fc extends C21132Af0 {
    public int A00;
    public boolean A01 = false;
    public final List A02;
    public final List A03;

    public C167198fc(List list) {
        C17960vV.A0G(AnonymousClass000.A1R(list.size()), "AllOfAsyncFuture: futures list is empty");
        this.A02 = C17880vN.A10(Collections.nCopies(list.size(), (Object) null));
        this.A03 = C17880vN.A10(Collections.nCopies(list.size(), (Object) null));
        this.A00 = list.size();
        for (int i = 0; i < list.size(); i++) {
            C21132Af0 af0 = (C21132Af0) list.get(i);
            af0.A09(new C21113Aeh(this, i, 0));
            af0.A00.A03(new C21113Aeh(this, i, 1), (Executor) null);
        }
    }
}
