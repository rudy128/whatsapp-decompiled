package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;

/* renamed from: X.0mD  reason: invalid class name and case insensitive filesystem */
public final class C12720mD extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass0NO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12720mD(AnonymousClass0NO r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass0XV r5 = (AnonymousClass0XV) obj;
        AnonymousClass0NO r2 = this.this$0;
        AnonymousClass0VQ r1 = r5.A05;
        if (r1 == null) {
            r1 = new AnonymousClass0VQ(r2.A01, r5);
            r5.A05 = r1;
        }
        r2.A00 = r1;
        AnonymousClass0VQ r0 = this.this$0.A00;
        if (r0 != null) {
            r0.A0E();
            AnonymousClass0NO r02 = this.this$0;
            AnonymousClass0VQ r3 = r02.A00;
            if (r3 != null) {
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = r02.A01;
                if (r3.A05 != subcomposeSlotReusePolicy) {
                    r3.A05 = subcomposeSlotReusePolicy;
                    AnonymousClass0VQ.A09(r3, false);
                    r3.A07.A0m(false, true);
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0k("SubcomposeLayoutState is not attached to SubcomposeLayout");
        }
        throw AnonymousClass000.A0k("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
