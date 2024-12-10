package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import com.whatsapp.group.GroupProfileEmojiEditor;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.49Z  reason: invalid class name */
public class AnonymousClass49Z extends A34 {
    public int A00;
    public Bitmap A01;
    public Bitmap A02;
    public Uri A03;
    public AnonymousClass11B A04;
    public final C37101oy A05;

    public AnonymousClass49Z(AnonymousClass1FL r2, C37101oy r3) {
        super(r2, true);
        this.A05 = r3;
    }

    public void A0F() {
        Bitmap bitmap;
        AnonymousClass1F9 A0A = A0A(GroupProfileEmojiEditor.class);
        if (A0A != null) {
            GroupProfileEmojiEditor groupProfileEmojiEditor = (GroupProfileEmojiEditor) A0A;
            this.A00 = C72463Mc.A0A(groupProfileEmojiEditor.A0A.A00);
            this.A01 = groupProfileEmojiEditor.A00;
            this.A03 = (Uri) groupProfileEmojiEditor.getIntent().getParcelableExtra("emojiEditorImageResult");
            this.A04 = groupProfileEmojiEditor.A08.A0O();
            try {
                bitmap = Bitmap.createBitmap(640, 640, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            this.A02 = bitmap;
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i;
        int i2;
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            i = -3;
        } else {
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(this.A00);
            canvas.drawBitmap(this.A01, 0.0f, 0.0f, AnonymousClass3MW.A06());
            i = -1;
            OutputStream outputStream = null;
            try {
                AnonymousClass11B r1 = this.A04;
                if (r1 == null) {
                    Log.w("GroupProfileEmojiEditor/render/bg contentResolver=null");
                } else {
                    outputStream = r1.A08(this.A03);
                }
                if (outputStream == null) {
                    i2 = -1;
                    AnonymousClass1EY.A02(outputStream);
                    this.A02.recycle();
                    return i2;
                }
                this.A02.compress(Bitmap.CompressFormat.JPEG, 85, outputStream);
                outputStream.flush();
                AnonymousClass1EY.A02(outputStream);
                this.A02.recycle();
                if (!this.A02.isCancelled()) {
                    i = 0;
                }
            } catch (IOException e) {
                if (this.A02.isCancelled() || e.getMessage() == null || !e.getMessage().contains("No space")) {
                    i2 = -1;
                } else {
                    i2 = -2;
                }
            } catch (Exception e2) {
                if (!this.A02.isCancelled()) {
                    Log.e("GroupProfileEmojiEditor/render/bg/error", e2);
                }
                i2 = -1;
            } catch (Throwable th) {
                AnonymousClass1EY.A02(outputStream);
                this.A02.recycle();
                throw th;
            }
        }
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        int i;
        Number number = (Number) obj;
        AnonymousClass1F9 A0A = A0A(GroupProfileEmojiEditor.class);
        if (A0A != null) {
            AnonymousClass1FY r2 = (AnonymousClass1FY) A0A;
            int intValue = number.intValue();
            if (intValue == 0) {
                Intent A0A2 = C17880vN.A0A();
                A0A2.setData((Uri) r2.getIntent().getParcelableExtra("emojiEditorImageResult"));
                A0A2.putExtra("emojiEditorImageResult", r2.getIntent().getParcelableExtra("emojiEditorImageResult"));
                A0A2.putExtra("skip_cropping", true);
                C72453Mb.A16(r2, A0A2);
            } else if (!this.A02.isCancelled()) {
                C17900vP.A0X(number, "GroupProfileEmojiEditor/render/error ", AnonymousClass000.A10());
                if (intValue == -2) {
                    r2.A0C.get();
                    i = 2131891425;
                    if (AnonymousClass11Z.A00()) {
                        i = 2131891422;
                    }
                } else if (intValue == -3) {
                    i = 2131889985;
                } else {
                    r2.A05.A08(2131889981, 1);
                    return;
                }
                r2.BhQ(i);
            }
        }
    }
}
