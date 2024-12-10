package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;
import com.whatsapp.community.JoinGroupBottomSheetFragment;

/* renamed from: X.4kF  reason: invalid class name and case insensitive filesystem */
public class C94224kF implements C42971z2 {
    public Object A00;
    public final int A01;
    public final Object A02;

    public C94224kF(GroupCallLogActivity groupCallLogActivity) {
        this.A01 = 0;
        this.A02 = groupCallLogActivity;
        this.A00 = AnonymousClass1VW.A06;
    }

    public /* synthetic */ void CBg() {
    }

    public void CIg(AnonymousClass1BI r2) {
        if (this.A01 == 0) {
            this.A00 = AnonymousClass1VW.A01(r2);
        }
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        if (2 - this.A01 == 0) {
            C18070vi.A0d(imageView, 0);
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            CN5(imageView);
        }
    }

    public void CN5(ImageView imageView) {
        Drawable drawable;
        AnonymousClass1VW r1;
        AnonymousClass1E7 r0;
        switch (this.A01) {
            case 0:
                GroupCallLogActivity groupCallLogActivity = (GroupCallLogActivity) this.A02;
                if (groupCallLogActivity.A07.A0D()) {
                    drawable = groupCallLogActivity.A07.A08(new C65482wZ(2), (AnonymousClass1VX) this.A00, 2131233521);
                    break;
                } else {
                    imageView.setImageResource(2131231047);
                    return;
                }
            case 1:
                r1 = ((JoinGroupBottomSheetFragment) this.A00).A0S;
                r0 = (AnonymousClass1E7) this.A02;
                break;
            default:
                C18070vi.A0d(imageView, 0);
                C78943ty r12 = (C78943ty) this.A02;
                boolean A0D = r12.A00.A0D();
                r1 = r12.A00;
                r0 = (AnonymousClass1E7) this.A00;
                if (A0D) {
                    r1.A0C(imageView, r0);
                    return;
                }
                break;
        }
        drawable = AnonymousClass3MZ.A0B(imageView, r1.A02(r0));
        C17960vV.A07(drawable);
        imageView.setImageDrawable(drawable);
    }

    public C94224kF(Object obj, Object obj2, int i) {
        this.A01 = i;
        this.A00 = obj;
        this.A02 = obj2;
    }
}
