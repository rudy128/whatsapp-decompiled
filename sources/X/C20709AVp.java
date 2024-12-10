package X;

import android.os.Parcelable;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.AVp  reason: case insensitive filesystem */
public final class C20709AVp implements C25471Oi, AnonymousClass3M6 {
    public final AnonymousClass190 A00;
    public final C63862to A01;
    public final C52122aP A02;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public void Bvr(C166278cd r14, AnonymousClass206 r15, C63362sw r16) {
        C20716AVw aVw;
        Jid A012;
        C63362sw r5 = r16;
        C18070vi.A0i(r5, r15);
        if (!(r15 instanceof C439721q) && (aVw = (C20716AVw) C63362sw.A00(r5, C20716AVw.class)) != null) {
            Jid jid = r5.A0Y;
            if (jid == null || !(jid instanceof C47712Jo)) {
                jid = r5.A0Z;
            }
            C194979sb r52 = new C194979sb(jid, r5.A04(), r5.A05(), r5.A01);
            String str = aVw.A01;
            byte[] bArr = null;
            if (!(r14 == null || (r14.bitField0_ & DefaultCrypto.BUFFER_SIZE) == 0)) {
                bArr = r14.ephemeralSharedSecret_.A06();
            }
            if (str != null && bArr == null) {
                throw new AnonymousClass9L5(1);
            } else if (str == null) {
                if (bArr != null) {
                    this.A00.A0G("DecryptionCallbackV2/handleBroadcastEphemeralSetting", "broadcast with secret but without ephemeral setting", false);
                    throw new AnonymousClass9L5(0);
                }
            } else if (aVw.A00 != 0) {
                throw new AnonymousClass9L5(1);
            } else if (bArr == null || bArr.length == 32) {
                Jid jid2 = r52.A02;
                UserJid userJid = r52.A03;
                if (!(userJid == null || bArr == null)) {
                    C63862to r0 = this.A01;
                    boolean A0T = C22971Dz.A0T(jid2);
                    AnonymousClass11S r02 = r0.A02;
                    if (A0T) {
                        A012 = r02.A0A();
                    } else {
                        A012 = AnonymousClass11S.A01(r02);
                    }
                    C18070vi.A0X(A012);
                    Jid jid3 = A012;
                    Parcelable.Creator creator = C47712Jo.CREATOR;
                    Jid jid4 = r52.A01;
                    if (!(jid4 instanceof C47712Jo)) {
                        jid4 = null;
                    }
                    C17960vV.A07(jid4);
                    C18070vi.A0X(jid4);
                    C18070vi.A0d(jid3, 2);
                    NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOOOO(1, str, jid3.getRawString(), userJid.getRawString(), (Object) null, bArr, jid4.getRawString());
                    if (nativeHolder != null) {
                        AnonymousClass9ZB r03 = new AnonymousClass9ZB(nativeHolder);
                        JniBridge.getInstance();
                        NativeHolder nativeHolder2 = r03.A00;
                        JniBridge.getInstance();
                        C29721cl r1 = new C29721cl((int) JniBridge.jvidispatchIIO(1, 34, nativeHolder2), JniBridge.jvidispatchIIO(2, 35, nativeHolder2) * 1000, 0);
                        r15.A0Z(r1.expiration);
                        r15.A0h(Long.valueOf(r1.ephemeralSettingTimestamp));
                        return;
                    }
                }
                throw new AnonymousClass9L5(0);
            } else {
                throw new AnonymousClass9L5(1);
            }
        }
    }

    public C20709AVp(AnonymousClass190 r1, C52122aP r2, C63862to r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }

    public String BSr() {
        return "IncomingBroadcastListHandler";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r5, C29621ca r6) {
        boolean A15 = C18070vi.A15(r6, r5);
        if (!C22971Dz.A0O(r5.A01)) {
            return null;
        }
        C29621ca A0K = r6.A0K("enc");
        int i = 0;
        if (A0K != null) {
            i = A0K.A0A("count", A15 ? 1 : 0);
        }
        return new C20716AVw(C29621ca.A02(r6, "eph_setting"), i);
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }
}
