package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.6nb  reason: invalid class name and case insensitive filesystem */
public final class C132796nb {
    public final Context A00;
    public final View.OnClickListener A01;
    public final View A02;
    public final PopupWindow A03;
    public final C18000vb A04;

    public final boolean A00(PopupWindow.OnDismissListener onDismissListener, InteractiveAnnotation interactiveAnnotation, PhotoView photoView, Float f, Float f2, boolean z) {
        float[] fArr;
        int i;
        PhotoView photoView2 = photoView;
        Bitmap photo = photoView2.getPhoto();
        if (photo == null) {
            return false;
        }
        InteractiveAnnotation interactiveAnnotation2 = interactiveAnnotation;
        if (!C1406872o.A01(interactiveAnnotation2) || f == null || f2 == null) {
            float height = (float) photo.getHeight();
            float[] fArr2 = {(float) photo.getWidth(), height};
            SerializablePoint[] serializablePointArr = interactiveAnnotation2.polygonVertices;
            SerializablePoint serializablePoint = serializablePointArr[0];
            double d = serializablePoint.x;
            double d2 = (double) fArr2[0];
            double d3 = d * d2;
            double d4 = (double) height;
            double d5 = serializablePoint.y * d4;
            SerializablePoint serializablePoint2 = serializablePointArr[1];
            double d6 = serializablePoint2.x * d2;
            double d7 = serializablePoint2.y * d4;
            SerializablePoint serializablePoint3 = serializablePointArr[2];
            double d8 = serializablePoint3.x * d2;
            double d9 = serializablePoint3.y * d4;
            SerializablePoint serializablePoint4 = serializablePointArr[3];
            double d10 = d2 * serializablePoint4.x;
            double d11 = d4 * serializablePoint4.y;
            double d12 = (d3 + d8) / 2.0d;
            double d13 = (d5 + d9) / 2.0d;
            if (d6 <= d12 && d12 <= d8) {
                double d14 = d6 - d8;
                if (d14 != 0.0d) {
                    d13 = d7 - (((d7 - d9) * (d6 - d12)) / d14);
                }
            } else if (d8 <= d12 && d12 <= d10) {
                double d15 = d8 - d10;
                if (d15 != 0.0d) {
                    d13 = d9 - (((d9 - d11) * (d8 - d12)) / d15);
                }
            } else if (d10 > d12 || d12 > d3) {
                double d16 = d3 - d6;
                if (d16 != 0.0d) {
                    d13 = d5 - (((d5 - d7) * (d3 - d12)) / d16);
                }
            } else {
                double d17 = d10 - d3;
                if (d17 != 0.0d) {
                    d13 = d11 - (((d11 - d5) * (d10 - d12)) / d17);
                }
            }
            fArr = new float[]{(float) d12, (float) d13};
            photoView2.getImageMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + ((float) photoView2.getLeft());
            fArr[1] = fArr[1] + ((float) photoView2.getTop());
            if (z) {
                int[] iArr = {0, 0};
                photoView2.getLocationOnScreen(iArr);
                fArr[0] = fArr[0] + ((float) iArr[0]);
                fArr[1] = fArr[1] + ((float) iArr[1]);
            }
        } else {
            fArr = new float[]{f.floatValue(), f2.floatValue()};
        }
        View rootView = photoView2.getRootView();
        C18070vi.A0X(rootView);
        int i2 = (int) fArr[0];
        int i3 = (int) fArr[1];
        PopupWindow popupWindow = this.A03;
        popupWindow.setHeight(-2);
        popupWindow.setWidth(-2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable((Resources) null, (Bitmap) null));
        popupWindow.setContentView(this.A02);
        TextView A0E = C17880vN.A0E(popupWindow.getContentView(), 2131436283);
        Object obj = interactiveAnnotation2.data;
        C18070vi.A0W(obj);
        if (obj instanceof SerializableLocation) {
            A0E.setText(2131896943);
        } else if (obj instanceof C20947Ac1) {
            A0E.setText(2131896944);
        } else if (C1406872o.A01(interactiveAnnotation2)) {
            A0E.setText(2131896942);
        }
        Drawable A002 = C24261Jm.A00(this.A00, 2131233242);
        C18000vb r2 = this.A04;
        A0E.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, new C74743cP(A002, r2), (Drawable) null);
        C43421zm.A04(A0E);
        C72463Mc.A12(popupWindow.getContentView());
        int measuredWidth = i2 - (popupWindow.getContentView().getMeasuredWidth() / 2);
        if (AnonymousClass3MW.A1Z(r2)) {
            if (A002 != null) {
                i = A002.getIntrinsicWidth();
            } else {
                i = 0;
            }
            measuredWidth -= i / 2;
        }
        AnonymousClass3MY.A1E(popupWindow.getContentView(), popupWindow, this, 14);
        popupWindow.setOnDismissListener(onDismissListener);
        popupWindow.setAnimationStyle(2132084875);
        popupWindow.showAtLocation(rootView, 0, measuredWidth, (int) (((float) i3) - (((float) popupWindow.getContentView().getMeasuredHeight()) * 0.82f)));
        return true;
    }

    public C132796nb(Context context, View.OnClickListener onClickListener, ViewGroup viewGroup, C18000vb r7) {
        C18070vi.A0o(context, r7, viewGroup);
        this.A00 = context;
        this.A04 = r7;
        this.A01 = onClickListener;
        this.A03 = new PopupWindow(context);
        LayoutInflater layoutInflater = (LayoutInflater) AnonymousClass11C.A02(context, "layout_inflater");
        C17960vV.A07(layoutInflater);
        this.A02 = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131627210, false);
    }
}
