package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.window.embedding.SplitController$splitInfoList$1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Il  reason: invalid class name and case insensitive filesystem */
public final class C24001Il extends AnonymousClass11D {
    public int A00 = 200;
    public AtomicBoolean A01 = new AtomicBoolean(false);
    public float A02;
    public final Context A03;
    public final C18030ve A04;
    public final C18100vl A05 = new C18110vm(new AnonymousClass1Io(this));
    public final C18100vl A06 = new C18110vm(new C24021In(this));
    public final C18100vl A07 = new C18110vm(new C24031Ip(this));
    public final C18100vl A08;
    public final C18100vl A09;
    public final C18100vl A0A = new C18110vm(new C24011Im(this));
    public final AnonymousClass11O A0B;
    public final AnonymousClass1DC A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24001Il(Context context, AnonymousClass11O r4, C18030ve r5, AnonymousClass1DC r6, AnonymousClass00H r7, C18100vl r8, C18100vl r9) {
        super(r7, C18150vq.A00(), false);
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r8, 2);
        C18070vi.A0d(r9, 3);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r6, 6);
        C18070vi.A0d(r7, 7);
        this.A04 = r5;
        this.A09 = r8;
        this.A08 = r9;
        this.A0B = r4;
        this.A03 = context;
        this.A0C = r6;
    }

    public final Intent A01(Activity activity, Intent intent) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0d(intent, 1);
        if (!A0A() || intent.getStringExtra("primary_container_class") != null) {
            return intent;
        }
        Intent A022 = AnonymousClass1LU.A02(activity);
        A022.setData(intent.getData());
        A022.putExtras(intent);
        A022.putExtra("primary_container_class", "com.whatsapp.HomeActivity");
        A022.putExtra("secondary_container_class", "com.whatsapp.Conversation");
        return A022;
    }

    public final void A03(Activity activity) {
        C18070vi.A0d(activity, 0);
        float A012 = AnonymousClass1ZO.A01(activity) / activity.getResources().getDisplayMetrics().density;
        float A002 = AnonymousClass1ZO.A00(activity) / activity.getResources().getDisplayMetrics().density;
        if (A012 > A002) {
            A012 = A002;
        }
        this.A02 = A012;
    }

    public final void A04(Activity activity, AnonymousClass1GV r7) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0d(r7, 1);
        if (A06()) {
            C52852ba r0 = (C52852ba) this.A0A.getValue();
            Executor A082 = C19740yt.A08(activity);
            C18070vi.A0X(A082);
            r0.A01.A01(r7, A082, AnonymousClass4I4.A00(new SplitController$splitInfoList$1(activity, r0.A00, (C30391dr) null)));
        }
    }

    public final void A05(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        if (A06()) {
            ((C52852ba) this.A0A.getValue()).A01.A00(r2);
        }
    }

    public final boolean A09() {
        return AnonymousClass112.A02() && Float.compare(this.A02, 600.0f) > 0 && !A06() && ((Boolean) this.A06.getValue()).booleanValue();
    }

    public static final C22728BMp A00(Intent intent, String str, List list) {
        ArrayList arrayList = new ArrayList(C29351c6.A0C(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C25129CZc(new ComponentName(str, (String) it.next())));
        }
        Set A12 = C29431cG.A12(arrayList);
        C25780Clr clr = BMq.A04;
        C25780Clr clr2 = BMq.A03;
        C25644CjX cjX = C25644CjX.A02;
        C25785Clw clw = C25785Clw.A02;
        C25645CjY cjY = C25645CjY.A03;
        new C25773Clk(cjY, clw);
        return new C22728BMp(intent, clr, clr2, new C25773Clk(cjY, C24508C7c.A00(0.4f)), cjX, A12);
    }

    public final boolean A0B() {
        String str = Build.MANUFACTURER;
        if (str == null || !str.equalsIgnoreCase("samsung")) {
            return true;
        }
        return C39761tb.A06();
    }

    public final void A02(int i, boolean z) {
        if (A0A()) {
            notifyAllObservers(new AnonymousClass35K(i, z, 1));
        }
    }

    public final boolean A06() {
        if (!A08() || !this.A0B.A00.getBoolean("otp_split_mode_user_choice", true)) {
            return false;
        }
        return true;
    }

    public final boolean A07() {
        if (!A09() || !this.A0B.A00.getBoolean("otp_split_mode_user_choice", true)) {
            return false;
        }
        return true;
    }

    public final boolean A08() {
        if (AnonymousClass112.A09() && A0B()) {
            Object value = ((D7F) ((C24746CIi) this.A09.getValue()).A00).A05.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append("SplitWindowManager/isSplitSupported ");
            sb.append(value);
            Log.i(sb.toString());
            if (!C18070vi.A18(value, C25643CjW.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0A() {
        if (A06() || A07()) {
            return true;
        }
        return false;
    }
}
