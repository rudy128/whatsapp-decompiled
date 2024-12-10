package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3cE  reason: invalid class name and case insensitive filesystem */
public class C74703cE extends C39381sz {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public Runnable A04;
    public List A05;
    public final String A06;
    public final AnonymousClass1L8 A07;
    public final AnonymousClass1KB A08;
    public final AnonymousClass11C A09;
    public final AnonymousClass206 A0A;

    public void A02() {
    }

    public void C8s(MotionEvent motionEvent, View view) {
        View view2 = view;
        C18070vi.A0d(view, 0);
        super.C8s(motionEvent, view);
        String str = this.A06;
        if (str == null) {
            return;
        }
        if (this.A01) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme == null) {
                return;
            }
            if ("http".equals(scheme) || "https".equals(scheme) || "rtsp".equals(scheme) || "ftp".equals(scheme) || "tel".equals(scheme) || "wapay".equals(scheme) || "upi".equals(scheme)) {
                Runnable runnable = this.A04;
                if (runnable == null) {
                    runnable = new C21456AkN(this, view2, parse, scheme, 4);
                    this.A04 = runnable;
                }
                this.A08.A0K(runnable, (long) ViewConfiguration.getLongPressTimeout());
                return;
            }
            return;
        }
        Runnable runnable2 = this.A04;
        if (runnable2 != null) {
            this.A08.A0I(runnable2);
        }
    }

    public void onClick(View view) {
        C18070vi.A0d(view, 0);
        String str = this.A06;
        if (str != null) {
            switch (this.A00) {
                case 1:
                case 2:
                case 3:
                case 6:
                    this.A07.CGW(AnonymousClass3MY.A04(view), Uri.parse(str), this.A0A, this.A01, this.A00);
                    break;
                default:
                    boolean z = this.A02;
                    AnonymousClass1L8 r4 = this.A07;
                    Context A042 = AnonymousClass3MY.A04(view);
                    Uri parse = Uri.parse(str);
                    AnonymousClass206 r1 = this.A0A;
                    if (!z) {
                        r4.CGU(A042, parse, r1);
                        break;
                    } else {
                        r4.CGV(A042, parse, r1, this.A01);
                        break;
                    }
            }
        }
        for (AnonymousClass5YY BEy : this.A05) {
            BEy.BEy();
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.A03);
    }

    public void A03(Uri uri, View view, String str) {
        String str2;
        int i;
        ClipboardManager A092 = this.A09.A09();
        if (A092 != null) {
            try {
                if ("wapay".equals(str)) {
                    str2 = uri.getLastPathSegment();
                    i = 2131893636;
                } else if ("tel".equals(str)) {
                    str2 = uri.getSchemeSpecificPart();
                    i = 2131894510;
                    A02();
                } else {
                    str2 = this.A06;
                    i = 2131891617;
                }
                Pair A0E = C17890vO.A0E(str2, i);
                CharSequence charSequence = (CharSequence) A0E.first;
                A092.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
                this.A01 = false;
                view.invalidate();
                AnonymousClass1KB r1 = this.A08;
                Object obj = A0E.second;
                C18070vi.A0W(obj);
                r1.A08(AnonymousClass000.A0M(obj), 0);
            } catch (NullPointerException | SecurityException e) {
                Log.e("linktouchablespan/copy/", e);
            }
        }
    }

    public final void A04(AnonymousClass5YY r2) {
        if (r2 != null) {
            this.A05 = C29431cG.A0l(r2, this.A05);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74703cE(Context context, AnonymousClass1L8 r4, AnonymousClass1KB r5, AnonymousClass11C r6, AnonymousClass206 r7, String str) {
        super(context);
        C18070vi.A0k(r5, r6);
        this.A05 = C18460wS.A00;
        this.A00 = 4;
        this.A08 = r5;
        this.A09 = r6;
        this.A07 = r4;
        this.A06 = str;
        this.A0A = r7;
    }

    public C74703cE(Context context, AnonymousClass1L8 r5, AnonymousClass1KB r6, AnonymousClass11C r7, String str, int i) {
        super(context, i);
        this.A05 = C18460wS.A00;
        this.A00 = 4;
        this.A08 = r6;
        this.A09 = r7;
        this.A07 = r5;
        this.A06 = str;
        this.A0A = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C74703cE(Context context, AnonymousClass1L8 r9, AnonymousClass1KB r10, AnonymousClass11C r11, String str) {
        this(context, r9, r10, r11, (AnonymousClass206) null, str);
        C18070vi.A0s(context, r10, r11, r9);
    }
}
