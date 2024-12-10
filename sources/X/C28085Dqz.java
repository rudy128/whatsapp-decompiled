package X;

import java.util.List;

/* renamed from: X.Dqz  reason: case insensitive filesystem */
public final class C28085Dqz extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16300s2 $contactList$delegate;
    public final /* synthetic */ C22821Di $onContactClick;
    public final /* synthetic */ C18090vk $onShareLinkClick;
    public final /* synthetic */ boolean $shouldHideShareLink;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28085Dqz(C16300s2 r2, C18090vk r3, C22821Di r4, boolean z) {
        super(1);
        this.$shouldHideShareLink = z;
        this.$onShareLinkClick = r3;
        this.$contactList$delegate = r2;
        this.$onContactClick = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C16150rn r8 = (C16150rn) obj;
        C18070vi.A0d(r8, 0);
        if (!this.$shouldHideShareLink) {
            r8.Bh6(AnonymousClass0LC.A01(new C28226Dtm(this.$onShareLinkClick), -1486789946, true));
        }
        r8.Bh6(CGD.A00);
        List list = (List) this.$contactList$delegate.getValue();
        C22821Di r2 = this.$onContactClick;
        C28148Ds8 ds8 = C28148Ds8.A00;
        int size = list.size();
        C28064Dqe dqe = new C28064Dqe(list, ds8);
        AnonymousClass04D A01 = AnonymousClass0LC.A01(new C28235Dtv(list, r2), -632812321, true);
        AnonymousClass0OO r3 = ((AnonymousClass0V2) r8).A00;
        AnonymousClass0V4 r22 = new AnonymousClass0V4(dqe, A01);
        if (size >= 0) {
            if (size != 0) {
                int i = r3.A00;
                C03210Hb r1 = new C03210Hb(r22, i, size);
                r3.A00 = i + size;
                r3.A02.A0F(r1);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass001.A13("size should be >=0, but was ", AnonymousClass000.A10(), size);
    }
}
