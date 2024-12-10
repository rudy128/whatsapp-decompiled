package X;

import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: X.1mM  reason: invalid class name and case insensitive filesystem */
public class C35511mM {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass1KB A02;

    public C35511mM(AnonymousClass1KB r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }

    public Boolean A01(Integer num) {
        C18070vi.A0d(num, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/isAutoCrosspostingOn called by ");
        sb.append(AnonymousClass6YH.A00(num));
        C18070vi.A0d(sb.toString(), 0);
        C61422pf r2 = (C61422pf) ((C129506hu) this.A00.get()).A03.get();
        if (C61422pf.A00(r2).contains("pref_xfamily_fb_auto_crossposting")) {
            return Boolean.valueOf(C61422pf.A00(r2).getBoolean("pref_xfamily_fb_auto_crossposting", false));
        }
        return null;
    }

    public void A02(C134466qd r4, Integer num) {
        C18070vi.A0d(num, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/linkAccount called by ");
        sb.append(AnonymousClass6YH.A00(num));
        C18070vi.A0d(sb.toString(), 0);
        C20017A3j.A01(new C157157vt(r4, (C129506hu) this.A00.get()), 2);
        this.A02.CGP(new C21429Ajw(this, 4));
    }

    public void A04(Integer num, boolean z) {
        C18070vi.A0d(num, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/unlinkAccount called by ");
        sb.append(AnonymousClass6YH.A00(num));
        C18070vi.A0d(sb.toString(), 0);
        AnonymousClass00H r3 = this.A00;
        C129506hu r2 = (C129506hu) r3.get();
        r2.A00.set((Object) null);
        C61422pf r22 = (C61422pf) r2.A03.get();
        C61422pf.A00(r22).edit().remove("pref_xfamily_fb_account_info").apply();
        C61422pf.A00(r22).edit().remove("pref_xfamily_fb_auto_crossposting").apply();
        C61422pf.A00(r22).edit().remove("pref_xfamily_fb_account_update_time").apply();
        C61422pf.A00(r22).edit().remove("pref_xfamily_fb_account_user_consented").apply();
        this.A02.CGP(new C21429Ajw(this, 5));
        if (z) {
            C61422pf.A00((C61422pf) ((C129506hu) r3.get()).A03.get()).edit().putBoolean("pref_xfamily_fb_account_has_system_unlinked", true).apply();
        }
    }

    public void A05(Integer num, boolean z) {
        C18070vi.A0d(num, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/updateIsAutoCrosspostingOn called by ");
        sb.append(AnonymousClass6YH.A00(num));
        C18070vi.A0d(sb.toString(), 0);
        C61422pf.A00((C61422pf) ((C129506hu) this.A00.get()).A03.get()).edit().putBoolean("pref_xfamily_fb_auto_crossposting", z).apply();
        this.A02.CGP(new C70813Cp(47, (Object) this, z));
    }

    public boolean A06(Integer num) {
        C18070vi.A0d(num, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/isAccountLinked called by ");
        sb.append(AnonymousClass6YH.A00(num));
        C18070vi.A0d(sb.toString(), 0);
        if (A00(num) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.87L] */
    public C134466qd A00(Integer num) {
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/getLinkedFbUserEntity called by ");
        sb.append(AnonymousClass6YH.A00(num));
        C18070vi.A0d(sb.toString(), 0);
        C129506hu r4 = (C129506hu) this.A00.get();
        AtomicReference atomicReference = r4.A00;
        if (atomicReference.get() != null) {
            return (C134466qd) atomicReference.get();
        }
        String string = C61422pf.A00((C61422pf) r4.A03.get()).getString("pref_xfamily_fb_account_info", (String) null);
        if (string == null) {
            return null;
        }
        String string2 = new JSONObject(((C58612ky) r4.A02.get()).A00(string)).getString("access_token");
        C18070vi.A0b(string2);
        C18070vi.A0d(string2, 0);
        C134466qd r1 = new C134466qd(new AnonymousClass77S(new C1418477e(new Object(), String.class, string2, "XFamilyFbAccessToken"), 2));
        atomicReference.set(r1);
        return r1;
    }

    public void A03(Integer num) {
        StringBuilder sb = new StringBuilder();
        sb.append("FbAccountManager/saveHasUserConsented called by ");
        sb.append(AnonymousClass6YH.A00(num));
        C18070vi.A0d(sb.toString(), 0);
        C61422pf.A00((C61422pf) ((C129506hu) this.A00.get()).A03.get()).edit().putBoolean("pref_xfamily_fb_account_user_consented", true).apply();
    }
}
