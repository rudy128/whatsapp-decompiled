package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.8my  reason: invalid class name */
public class AnonymousClass8my extends C60192nY {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass11Q A03;
    public final C18030ve A04;

    public boolean A0J() {
        return true;
    }

    private void A00(C1418377d r5) {
        C26981Ug r3 = new C26981Ug();
        ((C1193467t) this.A01.get()).A0J(new C21056Adm(r3), r5);
        try {
            r3.get(10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("RemoveRecentStickerHandler/removeStickerFromRecentBlocking ", e);
        }
    }

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        A6U a6u2 = a6u;
        String[] strArr = a6u2.A06;
        C62382rJ r5 = a6u2.A01;
        C166378cn r4 = a6u2.A03;
        if (strArr.length == 2 && AnonymousClass8BU.A1a("removeRecentSticker", strArr)) {
            String str2 = strArr[1];
            if (TextUtils.isEmpty(str2)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("remove-recent-sticker-mutation/from-key-value unable to create file hash from ");
                C17890vO.A19(A10, strArr[1]);
            } else if (C62382rJ.A03.equals(r5) && r4 != null && AnonymousClass8BW.A1Q(r4.bitField0_) && (r4.bitField0_ & 268435456) != 0) {
                AnonymousClass8YK r0 = r4.removeRecentStickerAction_;
                AnonymousClass8YK r1 = r0;
                if (r0 == null) {
                    r0 = AnonymousClass8YK.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 1) != 0) {
                    long j = r4.timestamp_;
                    if (r1 == null) {
                        r1 = AnonymousClass8YK.DEFAULT_INSTANCE;
                    }
                    return new C170528qA(a6u2.A02, str, str2, j, r1.lastStickerSentTs_, z);
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0G(C20126A8l a8l) {
        C1193467t r3;
        C1418377d r2;
        C21057Adn adn;
        C170528qA r8 = (C170528qA) a8l;
        AnonymousClass00H r6 = this.A01;
        Pair A0D = ((C1193467t) r6.get()).A0D(r8.A01);
        if (A0D != null) {
            long A05 = C17880vN.A05(A0D.second);
            long j = r8.A00;
            if (A05 == j) {
                r3 = (C1193467t) r6.get();
                r2 = (C1418377d) A0D.first;
                adn = new C21057Adn(this, r8, 0);
            } else if (A05 < j) {
                r3 = (C1193467t) r6.get();
                r2 = (C1418377d) A0D.first;
                adn = null;
            } else {
                A07(r8);
                return;
            }
            r3.A0J(adn, r2);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        C170528qA r8 = (C170528qA) a8l;
        AnonymousClass00H r6 = this.A01;
        Pair A0D = ((C1193467t) r6.get()).A0D(r8.A01);
        if (A0D == null || C17880vN.A05(A0D.second) > r8.A00) {
            A08(r8);
            return;
        }
        ((C1193467t) r6.get()).A0J(new C21057Adn(this, r8, 1), (C1418377d) A0D.first);
    }

    public /* bridge */ /* synthetic */ void A0I(C20126A8l a8l, C20126A8l a8l2) {
        C170528qA r7 = (C170528qA) a8l;
        C170528qA r8 = (C170528qA) a8l2;
        if (r8 == null) {
            Pair A0D = ((C1193467t) this.A01.get()).A0D(r7.A01);
            if (A0D != null) {
                C1418377d r5 = (C1418377d) A0D.first;
                if (r5.A0F != null) {
                    long A05 = C17880vN.A05(A0D.second);
                    long j = r7.A00;
                    if (A05 == j) {
                        A00(r5);
                    } else if (A05 < j) {
                        A00(r5);
                    }
                }
            }
            A0A(r7);
            return;
        } else if (r8.A00 <= r7.A00) {
            A0B(r7, r8);
            return;
        }
        A09(r7);
    }

    public AnonymousClass8my(AnonymousClass11S r1, AnonymousClass11Q r2, AnonymousClass11P r3, C26331Rs r4, C18030ve r5, AnonymousClass00H r6) {
        super(r4);
        this.A00 = r3;
        this.A04 = r5;
        this.A02 = r1;
        this.A01 = r6;
        this.A03 = r2;
    }

    public String A0D() {
        return "regular_low";
    }

    public String A0E() {
        return "removeRecentSticker";
    }

    public List A0F(boolean z) {
        return AnonymousClass000.A13();
    }
}
