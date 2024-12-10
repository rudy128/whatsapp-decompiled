package X;

import com.facebook.ale.p000native.AvatarLiveEditingNotificationDelegate;
import java.util.Iterator;

/* renamed from: X.D8c  reason: case insensitive filesystem */
public final class C26653D8c implements AvatarLiveEditingNotificationDelegate {
    public final /* synthetic */ D8Y A00;

    public synchronized void onAvatarGenerationBegin(String str) {
        C18070vi.A0d(str, 0);
        Iterator A01 = A01(this, "onAvatarGenerationBegin");
        while (A01.hasNext()) {
            ((C28490E3u) A01.next()).Bm1(new BO5(str));
        }
    }

    public synchronized void onAvatarGenerationEnd(boolean z, String str, String str2, String str3) {
        C18070vi.A0o(str, str2, str3);
        Iterator A01 = A01(this, "onAvatarGenerationEnd");
        while (A01.hasNext()) {
            ((C28490E3u) A01.next()).Bm1(new BOC(A00(str2), str, str3, z));
        }
    }

    public synchronized void onAvatarParametersUpdateBegin(String str) {
        C18070vi.A0d(str, 0);
        Iterator A01 = A01(this, "onAvatarParametersUpdateBegin");
        while (A01.hasNext()) {
            ((C28490E3u) A01.next()).Bm1(new BO6(str));
        }
    }

    public synchronized void onAvatarParametersUpdateEnd(String str, String str2) {
        C18070vi.A0h(str, str2);
        Iterator A01 = A01(this, "onAvatarParametersUpdateEnd");
        while (A01.hasNext()) {
            ((C28490E3u) A01.next()).Bm1(new BO9(str, A00(str2)));
        }
    }

    public synchronized void onAvatarRenderUpdateBegin(String str) {
        C18070vi.A0d(str, 0);
        Iterator A01 = A01(this, "onAvatarRenderUpdateBegin");
        while (A01.hasNext()) {
            ((C28490E3u) A01.next()).Bm1(new BO7(str));
        }
    }

    public synchronized void onAvatarRenderUpdateEnd(String str, String str2) {
        C18070vi.A0h(str, str2);
        Iterator A01 = A01(this, "onAvatarRenderUpdateEnd");
        while (A01.hasNext()) {
            ((C28490E3u) A01.next()).Bm1(new BOA(str, A00(str2)));
        }
    }

    public synchronized void onAvatarUpdateBegin(String str) {
        C18070vi.A0d(str, 0);
        Iterator A01 = A01(this, "onAvatarUpdateBegin");
        while (A01.hasNext()) {
            ((C28490E3u) A01.next()).Bm1(new BO8(str));
        }
    }

    public synchronized void onAvatarUpdateEnd(String str, String str2) {
        C18070vi.A0h(str, str2);
        Iterator A01 = A01(this, "onAvatarUpdateEnd");
        while (A01.hasNext()) {
            ((C28490E3u) A01.next()).Bm1(new BOB(str, A00(str2)));
        }
    }

    public C26653D8c(D8Y d8y) {
        this.A00 = d8y;
    }

    public static final Integer A00(String str) {
        Integer num = AnonymousClass00R.A00;
        if (str.equals("Success")) {
            return num;
        }
        Integer num2 = AnonymousClass00R.A01;
        if (str.equals("CDL Not Ready")) {
            return num2;
        }
        Integer num3 = AnonymousClass00R.A0C;
        if (str.equals("CDL Error")) {
            return num3;
        }
        Integer num4 = AnonymousClass00R.A0N;
        if (str.equals("No Current Avatar")) {
            return num4;
        }
        Integer num5 = AnonymousClass00R.A0Y;
        if (str.equals("Unknown Request Id")) {
            return num5;
        }
        Integer num6 = AnonymousClass00R.A0j;
        if (str.equals("Duplicate Request Id")) {
            return num6;
        }
        Integer num7 = AnonymousClass00R.A0u;
        if (str.equals("Skipped Request")) {
            return num7;
        }
        Integer num8 = AnonymousClass00R.A15;
        if (!str.equals("Internal Error")) {
            return AnonymousClass00R.A18;
        }
        return num8;
    }

    public static Iterator A01(C26653D8c d8c, String str) {
        C26294Cx6.A04("AvatarLiveEditingBridgeImpl", str);
        return d8c.A00.A00.iterator();
    }
}
