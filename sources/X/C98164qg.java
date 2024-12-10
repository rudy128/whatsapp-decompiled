package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;

/* renamed from: X.4qg  reason: invalid class name and case insensitive filesystem */
public class C98164qg implements AnonymousClass3M2 {
    public final /* synthetic */ AnonymousClass3u3 A00;

    public C98164qg(AnonymousClass3u3 r1) {
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass3u3 r6 = this.A00;
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = r6.A09;
        conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER);
        C72463Mc.A0x(r6.getContext(), r6.getResources(), conversationRowImage$RowImageView, 2130970113, 2131101227);
        AnonymousClass4aX.A0B(r6.getContext(), conversationRowImage$RowImageView, 2131232196, AnonymousClass1YL.A00(r6.getContext(), 2130970114, 2131101228));
        r6.A0I = false;
    }

    public int BZK() {
        return C88164Yo.A01(this.A00.A09.A08);
    }

    public void BuW() {
        this.A00.A2p();
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r6) {
        if (this instanceof C78593tA) {
            C78593tA r2 = (C78593tA) this;
            if (bitmap == null || !(r6 instanceof AnonymousClass21V)) {
                r2.A00();
                return;
            }
            r2.A01((AnonymousClass21V) r6);
            AnonymousClass3t9 r22 = (AnonymousClass3t9) r2;
            int i = r22.A00;
            AnonymousClass3u3 r0 = (AnonymousClass3u3) r22.A01;
            if (i != 0) {
                AnonymousClass3u3.A0D(bitmap, r0);
            } else {
                AnonymousClass3u3.A0E(bitmap, r0);
            }
        } else if (bitmap == null || !(r6 instanceof AnonymousClass21V)) {
            A00();
        } else {
            A01((AnonymousClass21V) r6);
            this.A00.A09.setImageBitmap(bitmap);
        }
    }

    public void CN4(View view) {
        AnonymousClass3u3 r1 = this.A00;
        r1.A0I = false;
        r1.A09.setBackgroundColor(-7829368);
    }

    public void A01(AnonymousClass21V r6) {
        int i;
        ImageView.ScaleType scaleType;
        C62572rc A002 = AnonymousClass206.A00(r6);
        int i2 = A002.A08;
        if (i2 != 0 && (i = A002.A06) != 0) {
            AnonymousClass3u3 r0 = this.A00;
            boolean z = r0 instanceof C79023uB;
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = r0.A09;
            conversationRowImage$RowImageView.A04(i2, i);
            if (r0.A0V || z) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = ImageView.ScaleType.MATRIX;
            }
            conversationRowImage$RowImageView.setScaleType(scaleType);
        }
    }
}
