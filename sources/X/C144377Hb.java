package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.7Hb  reason: invalid class name and case insensitive filesystem */
public class C144377Hb implements C1606889n {
    public final /* synthetic */ AnonymousClass73R A00;

    public /* synthetic */ void Bti() {
    }

    public C144377Hb(AnonymousClass73R r1) {
        this.A00 = r1;
    }

    public void BCw() {
        AnonymousClass73R r0 = this.A00;
        ImageView imageView = r0.A05;
        imageView.setImageBitmap((Bitmap) null);
        r0.A03.setBackground((Drawable) null);
        imageView.setBackgroundResource(0);
    }

    public void C7F(Bitmap bitmap, boolean z) {
        Resources resources;
        int i;
        AnonymousClass73R r1 = this.A00;
        ImageView imageView = r1.A05;
        imageView.setImageBitmap(bitmap);
        Bitmap bitmap2 = A5O.A07;
        FrameLayout frameLayout = r1.A03;
        if (bitmap == bitmap2) {
            frameLayout.setBackground((Drawable) null);
            resources = r1.A0C.getResources();
            i = 2131231029;
        } else {
            AudioPickerActivity audioPickerActivity = r1.A0C;
            frameLayout.setBackground(audioPickerActivity.getResources().getDrawable(2131231033));
            resources = audioPickerActivity.getResources();
            i = 2131231030;
        }
        imageView.setBackground(resources.getDrawable(i));
    }
}
