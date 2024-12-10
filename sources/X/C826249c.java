package X;

import android.os.SystemClock;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.49c  reason: invalid class name and case insensitive filesystem */
public class C826249c extends A34 {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1NN A03;
    public final AnonymousClass1E7 A04;
    public final AnonymousClass12M A05;
    public final String A06;
    public final WeakReference A07;

    public void A0F() {
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A07.get();
        if (groupChatInfoActivity != null) {
            groupChatInfoActivity.A00.setVisibility(0);
            groupChatInfoActivity.A1Y.setVisibility(8);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String A002;
        String str;
        String str2 = this.A06;
        AnonymousClass1E7 r11 = this.A04;
        C84954Lm r12 = new C84954Lm(this);
        AnonymousClass11P r2 = this.A02;
        AnonymousClass1KB r9 = this.A00;
        AnonymousClass11S r1 = this.A01;
        AnonymousClass12M r14 = this.A05;
        AnonymousClass1NN r10 = this.A03;
        boolean A15 = C18070vi.A15(str2, r11);
        C72473Md.A1M(r2, r9, r1, 3);
        C18070vi.A0l(r14, r10);
        if (str2.length() == 0) {
            A002 = null;
        } else {
            A002 = AnonymousClass1PP.A00(r1, r2, A15);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C96454ns r8 = new C96454ns(r9, r10, r11, r12, str2);
        AnonymousClass1EC r13 = (AnonymousClass1EC) AnonymousClass3Ma.A0m(r11);
        C42661yX r0 = r11.A0M;
        if (r0 != null) {
            str = r0.A04;
        } else {
            str = null;
        }
        try {
            r14.A07(r8, r13, str, A002, str2).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
            }
            return null;
        } catch (Exception e) {
            Log.w("groupinfo/setgroupdescription/timeout", e);
            r8.Bt1("", A15 ? 1 : 0);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A07.get();
        if (groupChatInfoActivity != null) {
            groupChatInfoActivity.A00.setVisibility(8);
            groupChatInfoActivity.A1Y.setVisibility(0);
        }
    }

    public C826249c(AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass11P r4, AnonymousClass1NN r5, AnonymousClass1E7 r6, GroupChatInfoActivity groupChatInfoActivity, AnonymousClass12M r8, String str) {
        C18070vi.A0w(r4, r2, r3, r8, r5);
        C18070vi.A0l(r6, str);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r8;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = str;
        this.A07 = AnonymousClass3MW.A0z(groupChatInfoActivity);
    }
}
