package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0ek  reason: invalid class name and case insensitive filesystem */
public final class C08220ek extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass0N0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08220ek(AnonymousClass0N0 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass0N0 r8 = this.this$0;
        int i = 0;
        r8.A00 = false;
        HashSet hashSet = new HashSet();
        C06970a9 r5 = r8.A03;
        int i2 = r5.A00;
        if (i2 > 0) {
            Object[] objArr = r5.A01;
            int i3 = 0;
            do {
                AnonymousClass0XV r9 = (AnonymousClass0XV) objArr[i3];
                AnonymousClass0OJ r1 = (AnonymousClass0OJ) r8.A04.A01[i3];
                if (r9.A0S.A01.A07) {
                    AnonymousClass0N0.A00(r9.A0S.A01, r1, hashSet);
                }
                i3++;
            } while (i3 < i2);
        }
        r5.A08();
        r8.A04.A08();
        C06970a9 r52 = r8.A01;
        int i4 = r52.A00;
        if (i4 > 0) {
            Object[] objArr2 = r52.A01;
            do {
                AnonymousClass0XW r2 = (AnonymousClass0XW) objArr2[i];
                AnonymousClass0OJ r12 = (AnonymousClass0OJ) r8.A02.A01[i];
                if (r2.A07) {
                    AnonymousClass0N0.A00(r2, r12, hashSet);
                }
                i++;
            } while (i < i4);
        }
        r52.A08();
        r8.A02.A08();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((AnonymousClass09G) it.next()).A0N();
        }
        return C27621Wu.A00;
    }
}
