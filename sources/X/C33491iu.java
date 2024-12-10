package X;

import com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResultSendWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1iu  reason: invalid class name and case insensitive filesystem */
public final class C33491iu {
    public final AnonymousClass19K A00;
    public volatile int A01;

    public C33491iu(AnonymousClass19K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(int i, int i2, boolean z) {
        C192939pH r2 = new C192939pH();
        C17880vN.A1P("disclosure_id", r2.A00, i);
        C17880vN.A1P("result", r2.A00, i2);
        A6Y A002 = r2.A00();
        A1B a1b = new A1B();
        a1b.A00 = AnonymousClass00R.A01;
        C20078A6e A012 = a1b.A01();
        C196269uj r4 = new C196269uj(DisclosureResultSendWorker.class);
        r4.A07("tag.whatsapp.privacy.SendDisclosureResult");
        r4.A04(A002);
        Integer num = AnonymousClass00R.A00;
        if (z) {
            r4.A06(num, TimeUnit.SECONDS, 10);
            r4.A05(num);
        } else {
            r4.A06(num, TimeUnit.MINUTES, 30);
            r4.A03(A012);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("tag.whatsapp.privacy.SendDisclosureResult.");
        sb.append(i);
        sb.append('.');
        sb.append(i2);
        String obj = sb.toString();
        ((A7W) this.A00.get()).A07((C162248Jv) r4.A00(), num, obj);
    }

    public final void A01(boolean z, int i) {
        C192939pH r2 = new C192939pH();
        C17880vN.A1P("disclosure_id", r2.A00, i);
        A6Y A002 = r2.A00();
        A1B a1b = new A1B();
        a1b.A00 = AnonymousClass00R.A01;
        C20078A6e A012 = a1b.A01();
        C196269uj r4 = new C196269uj(DisclosureMetadataGetWorker.class);
        r4.A07("tag.whatsapp.privacy.GetDisclosureMetadata");
        r4.A04(A002);
        Integer num = AnonymousClass00R.A00;
        if (z) {
            r4.A06(num, TimeUnit.SECONDS, 10);
            r4.A05(num);
        } else {
            r4.A06(num, TimeUnit.MINUTES, 30);
            r4.A03(A012);
        }
        C162248Jv r42 = (C162248Jv) r4.A00();
        StringBuilder sb = new StringBuilder();
        sb.append("tag.whatsapp.privacy.GetDisclosureMetadata.");
        sb.append(this.A01);
        String obj = sb.toString();
        this.A01++;
        if (this.A01 > 1000) {
            this.A01 = 0;
        }
        ((A7W) this.A00.get()).A07(r42, num, obj);
    }

    public final void A02(int[] iArr) {
        C192939pH r1 = new C192939pH();
        r1.A01("disclosure_ids", iArr);
        A6Y A002 = r1.A00();
        A1B a1b = new A1B();
        a1b.A00 = AnonymousClass00R.A01;
        C20078A6e A012 = a1b.A01();
        C196269uj r3 = new C196269uj(DisclosureGetStageByIdsWorker.class);
        r3.A07("tag.whatsapp.privacy.GetDisclosureStageByIds");
        r3.A04(A002);
        r3.A03(A012);
        Integer num = AnonymousClass00R.A00;
        r3.A06(num, TimeUnit.MINUTES, 30);
        C162248Jv r32 = (C162248Jv) r3.A00();
        StringBuilder sb = new StringBuilder();
        sb.append("tag.whatsapp.privacy.GetDisclosureStageByIds.");
        sb.append(this.A01);
        String obj = sb.toString();
        this.A01++;
        if (this.A01 > 1000) {
            this.A01 = 0;
        }
        ((A7W) this.A00.get()).A07(r32, num, obj);
    }
}
