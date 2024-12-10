package X;

import android.graphics.Rect;
import android.os.Handler;
import java.util.List;

/* renamed from: X.9hf  reason: invalid class name and case insensitive filesystem */
public class C188589hf {
    public C216816z A00;
    public boolean A01 = false;
    public final Rect A02 = AnonymousClass3MW.A07();
    public final Rect A03 = AnonymousClass3MW.A07();
    public final Handler A04;
    public final E7V A05;
    public final C191479mf A06;
    public final BTG A07;
    public final C185409cX A08;
    public final C140006zn A09;
    public final Runnable A0A;
    public final List A0B = AnonymousClass000.A13();
    public final List A0C = AnonymousClass000.A13();

    public C188589hf(Handler handler, E7V e7v, C191479mf r5, BTG btg, C185409cX r7, C140006zn r8) {
        this.A07 = btg;
        this.A06 = r5;
        this.A05 = e7v;
        this.A09 = r8;
        this.A08 = r7;
        this.A04 = handler;
        this.A0A = new C21470Akb(this, new Exception());
    }
}
