package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.30g  reason: invalid class name and case insensitive filesystem */
public class C676330g implements AnonymousClass1WR {
    public final AnonymousClass00H A00;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public void ByH(AnonymousClass206 r8, int i) {
        if (i == 29) {
            return;
        }
        if (r8 instanceof C444323k) {
            C35311m1 r3 = (C35311m1) this.A00.get();
            r3.A08.execute(new C146527Pl(r3, r8, 10));
        } else if (r8 instanceof C444723o) {
            C444723o r82 = (C444723o) r8;
            int i2 = r82.A00;
            String str = r82.A02;
            AnonymousClass1BI r32 = r82.A0v.A00;
            AnonymousClass1BI A0H = r82.A0H();
            if (TextUtils.isEmpty(str) || r32 == null || A0H == null) {
                Log.w("ScheduleCallMessageObserver/onMessageAdded FMessageScheduledCallEdit has empty parentMessageId or chatJid or senderJid");
            } else if (i2 == 1) {
                C35311m1 r2 = (C35311m1) this.A00.get();
                r2.A08.execute(new C21456AkN(r2, r32, A0H, str, 44));
            }
        }
    }

    public C676330g(AnonymousClass00H r1) {
        this.A00 = r1;
    }
}
