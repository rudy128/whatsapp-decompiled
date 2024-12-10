package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Ui  reason: invalid class name and case insensitive filesystem */
public class C27001Ui {
    public long A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final AnonymousClass1UM A03;
    public final AnonymousClass1UJ A04;
    public final AnonymousClass1U8 A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass1KB A09;
    public final AnonymousClass11S A0A;
    public final AnonymousClass181 A0B;
    public final C23651Hc A0C;
    public final C26881Tv A0D;
    public final AnonymousClass118 A0E;
    public final AnonymousClass12L A0F;
    public final AnonymousClass1U9 A0G;
    public final C220418j A0H;
    public final AnonymousClass11W A0I;
    public final AnonymousClass10I A0J;

    public void A00(AnonymousClass9X7 r13, AnonymousClass1BI r14, C57732jY r15, String str, int i, int i2, boolean z) {
        AnonymousClass1BI r5 = r14;
        if (r14 != null && r14.isProtocolCompliant() && !C22971Dz.A0N(r14) && !C22971Dz.A0V(r14)) {
            if (!C42761yh.A01(this.A0F, r14) && this.A00 < AnonymousClass11P.A01(this.A01)) {
                C54562eL r1 = (C54562eL) this.A06.get();
                int i3 = i2;
                if (((i2 & 1) != 0 && r1.A01.A02(r14)) || ((i2 & 2) != 0 && r1.A02.A02(r14))) {
                    this.A0J.CGF(new C21441Ak8(r13, r5, this, r15, str, i, i3, z));
                }
            }
        }
    }

    public void A03(AnonymousClass1BI r9, String str, int i, int i2, boolean z) {
        A00((AnonymousClass9X7) null, r9, (C57732jY) null, str, i, i2, z);
    }

    public void A04(C55782gM r12, long j) {
        C55782gM r3 = r12;
        if (r12.A01 == -1) {
            C58912lS r0 = ((C54562eL) this.A06.get()).A02;
            AnonymousClass1BI r1 = r12.A03;
            r0.A01(r1);
            this.A0D.A03(r1);
            return;
        }
        int i = r12.A02;
        long j2 = j;
        if (r12.A04 != null) {
            this.A0G.A01(r12, j);
        } else if (r12.A06 != null) {
            AnonymousClass118 r2 = this.A0E;
            AnonymousClass11W r6 = this.A0I;
            AnonymousClass10I r7 = this.A0J;
            C121936Mb.A01(this.A0B, this.A0D, r2, r3, this.A05, this.A0H, r6, r7, 0, j2);
        } else {
            this.A0D.A04(r12);
            AnonymousClass1U8 r22 = this.A05;
            int i2 = 1;
            if (i == 1) {
                i2 = 2;
            }
            r22.A00((Double) null, Long.valueOf(SystemClock.elapsedRealtime() - j), 1, i2, 200);
        }
    }

    public void A01(AnonymousClass1BI r5, int i) {
        if (i == 500 || i == 501 || i == 503) {
            this.A00 = AnonymousClass11P.A01(this.A01) + 3600000;
        } else if (i == 401 && r5 != null && !C22971Dz.A0e(r5)) {
            this.A0D.A03(r5);
        }
    }

    public void A02(AnonymousClass1BI r19, AnonymousClass1EC r20, int i, int i2) {
        String str;
        String str2;
        AnonymousClass1BI r4 = r19;
        StringBuilder sb = new StringBuilder();
        sb.append("ProfilePhotoManager/sendGetSubProfilePhoto photoId:");
        int i3 = i;
        sb.append(i3);
        sb.append(" query type:");
        sb.append("url");
        sb.append(" jid:");
        sb.append(r4);
        sb.append(" image type:");
        int i4 = i2;
        sb.append(i4);
        Log.i(sb.toString());
        if (i4 == 1) {
            str = "image";
        } else {
            str = "preview";
        }
        C58422kf r3 = new C58422kf(new C683933e((AnonymousClass9X7) null, this, this, this.A05, (C57732jY) null, (C54562eL) this.A06.get()), (AnonymousClass1OZ) this.A07.get());
        GroupJid groupJid = (GroupJid) r4;
        if (i > 0) {
            str2 = Integer.toString(i3);
        } else {
            str2 = null;
        }
        C18070vi.A0d(groupJid, 0);
        r3.A00(groupJid, r20, r3.A00.A0B(), (String) null, str2, str, "url");
    }

    public void A05(AnonymousClass73O r15) {
        AnonymousClass1BI r6 = r15.A0F;
        if (r6.isProtocolCompliant() && this.A0C.A07 && this.A00 < AnonymousClass11P.A01(this.A01)) {
            Log.w("app/sendSetProfilePhoto");
            AnonymousClass376 r8 = new AnonymousClass376(r6, (AnonymousClass1OZ) this.A07.get(), r15);
            byte[] bArr = r15.A02;
            boolean A0O = this.A0A.A0O(r6);
            boolean z = false;
            if (bArr == null) {
                z = true;
            }
            r8.A00 = z;
            AnonymousClass1OZ r7 = r8.A02;
            String A0B2 = r7.A0B();
            C29591cX r4 = new C29591cX("iq");
            r4.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2));
            r4.A04(new AnonymousClass1MD("xmlns", "w:profile:picture"));
            r4.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
            r4.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
            if (!A0O) {
                r4.A04(new AnonymousClass1MD((Jid) r8.A01, "target"));
            }
            C29591cX r2 = new C29591cX("picture");
            r2.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "image"));
            r2.A01 = bArr;
            r4.A05(r2.A03());
            r7.A0N(r8, r4.A03(), A0B2, 25, 0);
        }
    }

    public C27001Ui(AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass181 r4, C23651Hc r5, C26881Tv r6, AnonymousClass11P r7, AnonymousClass118 r8, C18030ve r9, AnonymousClass12L r10, AnonymousClass1U9 r11, AnonymousClass1UM r12, AnonymousClass1UJ r13, AnonymousClass1U8 r14, C220418j r15, AnonymousClass11W r16, AnonymousClass10I r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20) {
        this.A0E = r8;
        this.A01 = r7;
        this.A02 = r9;
        this.A09 = r2;
        this.A0A = r3;
        this.A0I = r16;
        this.A0J = r17;
        this.A0B = r4;
        this.A0F = r10;
        this.A07 = r18;
        this.A06 = r19;
        this.A0C = r5;
        this.A0H = r15;
        this.A0D = r6;
        this.A05 = r14;
        this.A04 = r13;
        this.A08 = r20;
        this.A03 = r12;
        this.A0G = r11;
    }
}
