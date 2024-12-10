package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.expressionstray.ExpressionsTrayView;
import com.whatsapp.group.GroupProfileEmojiEditor;
import com.whatsapp.group.KeyboardControllerViewModel;

/* renamed from: X.4n1  reason: invalid class name and case insensitive filesystem */
public class C95924n1 implements C107395Zn {
    public BottomSheetBehavior A00;
    public C107845ai A01;
    public C136686uD A02;
    public EmojiSearchKeyboardContainer A03;
    public ExpressionsTrayView A04;
    public C117015z4 A05;
    public C80753xv A06;
    public GroupProfileEmojiEditor A07;
    public KeyboardControllerViewModel A08;
    public AnonymousClass7MX A09;
    public AnonymousClass722 A0A;
    public final C1193267r A0B;
    public final AnonymousClass1KW A0C;
    public final C131196kh A0D;
    public final AnonymousClass18K A0E;
    public final C134206qD A0F;
    public final C140126zz A0G;
    public final C26631Sw A0H;
    public final AnonymousClass00H A0I;

    public static void A00(Resources resources, Drawable drawable, C95924n1 r6) {
        if (drawable instanceof C109515dZ) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getBounds().width(), drawable.getBounds().height(), Bitmap.Config.ARGB_8888);
                if (createBitmap != null) {
                    Canvas canvas = new Canvas(createBitmap);
                    C109515dZ r5 = (C109515dZ) drawable;
                    Bitmap bitmap = r5.A06.A0B;
                    C18070vi.A0X(bitmap);
                    C109515dZ.A00(bitmap, canvas, r5);
                    KeyboardControllerViewModel keyboardControllerViewModel = r6.A08;
                    C17960vV.A07(keyboardControllerViewModel);
                    keyboardControllerViewModel.A0T(new BitmapDrawable(resources, createBitmap), 0);
                    return;
                }
            } catch (OutOfMemoryError unused) {
            }
            KeyboardControllerViewModel keyboardControllerViewModel2 = r6.A08;
            C17960vV.A07(keyboardControllerViewModel2);
            keyboardControllerViewModel2.A0T((Drawable) null, 3);
            return;
        }
        KeyboardControllerViewModel keyboardControllerViewModel3 = r6.A08;
        C17960vV.A07(keyboardControllerViewModel3);
        keyboardControllerViewModel3.A0T(drawable, 0);
    }

    public void BsX(AnonymousClass737 r3) {
        this.A01.BsW(r3.A00);
    }

    public C95924n1(C1193267r r1, AnonymousClass1KW r2, C131196kh r3, AnonymousClass18K r4, C134206qD r5, C140126zz r6, C26631Sw r7, AnonymousClass00H r8) {
        this.A0E = r4;
        this.A0C = r2;
        this.A0B = r1;
        this.A0G = r6;
        this.A0H = r7;
        this.A0D = r3;
        this.A0F = r5;
        this.A0I = r8;
    }
}
