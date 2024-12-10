package X;

import android.content.SharedPreferences;

/* renamed from: X.1Oj  reason: invalid class name and case insensitive filesystem */
public final class C25481Oj implements C25471Oi {
    public final C25451Og A00;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final C25461Oh A03;

    public C25481Oj(C25451Og r2, C19830z4 r3, C18030ve r4, C25461Oh r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public void Bvt(C63362sw r6) {
        String str;
        C18070vi.A0d(r6, 0);
        AnonymousClass206 r3 = r6.A0A;
        if (r3 != null && (r3 instanceof AnonymousClass210)) {
            String A0P = r3.A0P();
            if ((r3 instanceof AnonymousClass210) && A0P != null && AnonymousClass72X.A02(A0P)) {
                C18030ve r2 = this.A02;
                if (C18020vd.A05(C18040vf.A02, r2, 9669)) {
                    boolean A012 = C26180Cu0.A01(r2, this.A03, r3.A0P());
                    C25451Og r1 = this.A00;
                    SharedPreferences.Editor edit = C25451Og.A00(r1).edit();
                    SharedPreferences A002 = C25451Og.A00(r1);
                    if (A012) {
                        str = "animated_emoji_receive_count";
                    } else {
                        str = "single_emoji_receive_count";
                    }
                    edit.putInt(str, A002.getInt(str, 0) + 1).apply();
                }
            }
        }
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public String BSr() {
        return "SingleEmojiDailyLoggingManager";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
