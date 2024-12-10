package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6t8  reason: invalid class name and case insensitive filesystem */
public abstract class C136016t8 {
    public AnonymousClass7E7 A00 = new AnonymousClass7E7(this);
    public final C27181Vb A01;
    public final C139326ye A02;
    public final C32021gV A03;
    public final AnonymousClass1T1 A04;

    public final AnonymousClass72S A01(Context context, AnonymousClass1E7 r9, AnonymousClass206 r10, AnonymousClass229 r11, boolean z) {
        AnonymousClass6GF r3;
        File file;
        RectF rectF;
        C003101k A022 = C28281Zt.A02(context);
        if (this instanceof AnonymousClass6GK) {
            AnonymousClass6GF r32 = new AnonymousClass6GF(A022);
            AnonymousClass7E7 r1 = this.A00;
            C18070vi.A0d(r1, 0);
            Bitmap A002 = C110375fP.A00((Bitmap) null, r10, r1);
            if (A002 != null) {
                r32.setBackground(r32.A02(A002));
                r32.A00.setImageBitmap(A002);
            }
            r32.A03();
            r3 = r32;
        } else if (this instanceof AnonymousClass6GL) {
            AnonymousClass6GL r2 = (AnonymousClass6GL) this;
            r3 = new AnonymousClass6GG(A022, r2.A00, r2.A02);
        } else {
            AnonymousClass6BF r33 = new AnonymousClass6BF(A022);
            if (r9 != null) {
                r33.A04(r9, r10, this.A00, z);
            }
            r33.A05(r10);
            r3 = r33;
        }
        if (r10 instanceof AnonymousClass21X) {
            AnonymousClass21V r102 = (AnonymousClass21V) r10;
            C62572rc r0 = r102.A02;
            if (!(r0 == null || (file = r0.A0G) == null)) {
                Uri fromFile = Uri.fromFile(file);
                C18070vi.A0b(fromFile);
                AnonymousClass72S r6 = new AnonymousClass72S(fromFile);
                r6.A0N(file);
                r6.A0O(C17880vN.A0j());
                r6.A0K(new Point(VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT, VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH));
                float dimension = A022.getResources().getDimension(2131166857);
                ThumbnailButton mediaView = r3.getMediaView();
                if (mediaView != null) {
                    if (r102.A02 != null) {
                        rectF = C139326ye.A00(r3, mediaView);
                    } else {
                        rectF = null;
                    }
                    r6.A0M(rectF);
                    r6.A0I();
                    File A012 = this.A02.A01(A022, r3, mediaView, dimension);
                    if (A012 != null) {
                        A03(r3, r6, A02(r11, r3, A012));
                    }
                    return r6;
                }
            }
        } else {
            File A013 = this.A02.A01(A022, r3, (View) null, 0.0f);
            if (A013 != null) {
                Uri fromFile2 = Uri.fromFile(A013);
                C18070vi.A0b(fromFile2);
                AnonymousClass72S r5 = new AnonymousClass72S(fromFile2);
                r5.A0N(A013);
                r5.A0O(1);
                A03(r3, r5, A02(r11, r3, (File) null));
                return r5;
            }
        }
        return null;
    }

    public final void A03(View view, AnonymousClass72S r6, List list) {
        float f = 3.0f / AnonymousClass3MX.A05(view).getDisplayMetrics().density;
        RectF A042 = C108965cb.A04(C108945cZ.A03(view) * f, C108945cZ.A04(view) * f);
        r6.A0Q(this.A04.A00(A042, A042, list, 0).A05());
    }

    public ArrayList A02(AnonymousClass229 r5, C110375fP r6, File file) {
        ArrayList A13;
        if (this instanceof AnonymousClass6GK) {
            A13 = AnonymousClass000.A13();
            if (file != null) {
                A13.add(new AnonymousClass69W(C18070vi.A0H(file)));
            }
        } else if (this instanceof AnonymousClass6GL) {
            A13 = AnonymousClass000.A13();
            if (file != null) {
                A13.add(new AnonymousClass69W(C18070vi.A0H(file)));
                return A13;
            }
        } else {
            AnonymousClass6BF r62 = (AnonymousClass6BF) r6;
            C20947Ac1 ac1 = (C20947Ac1) r5;
            ArrayList A132 = AnonymousClass000.A13();
            if (file != null) {
                A132.add(new AnonymousClass69W(C18070vi.A0H(file)));
            }
            if (ac1 != null) {
                RectF readMoreRectF = r62.getReadMoreRectF();
                if (readMoreRectF != null) {
                    A132.add(AnonymousClass6GM.A00(readMoreRectF, r62, ac1, true));
                }
                A132.add(AnonymousClass6GM.A00((RectF) null, r62.A0T, ac1, false));
            }
            return A132;
        }
        return A13;
    }

    public C136016t8(AnonymousClass1T1 r2, C27181Vb r3, C139326ye r4, C32021gV r5) {
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r2;
        this.A02 = r4;
    }
}
