package com.whatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C17880vN;
import X.C72453Mb;
import X.C72693Nd;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SeeMoreTextView extends WaTextView {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public final Paint A04 = AnonymousClass3MW.A06();

    public void onMeasure(int i, int i2) {
        int size;
        SpannableStringBuilder A09;
        ArrayList arrayList;
        int i3 = i;
        if (!this.A03 && (size = View.MeasureSpec.getSize(i3) - C72453Mb.A0C(this)) > 0) {
            String A18 = AnonymousClass3MZ.A18(this);
            String A182 = AnonymousClass3MZ.A18(this);
            ArrayList A13 = AnonymousClass000.A13();
            ArrayList A132 = AnonymousClass000.A13();
            for (String str : A182.split("\\s")) {
                Paint paint = this.A04;
                float f = (float) size;
                if (paint.measureText(str) < f) {
                    A0G(paint, str, A13, A132, size);
                } else {
                    if (!TextUtils.isEmpty(str) && paint.measureText(str) > f) {
                        ArrayList A133 = AnonymousClass000.A13();
                        int i4 = 1;
                        int i5 = 0;
                        while (true) {
                            int length = str.length();
                            if (i4 > length) {
                                arrayList = A133;
                                break;
                            }
                            if (paint.measureText(str.substring(i5, i4)) >= f) {
                                int i6 = i4 - 1;
                                A133.add(str.substring(i5, i6));
                                i5 = i6;
                            }
                            if (i4 == length) {
                                A133.add(str.substring(i5, i4));
                            }
                            i4++;
                        }
                    } else {
                        arrayList = Collections.singletonList(str);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        A0G(paint, C17880vN.A0v(it), A13, A132, size);
                    }
                }
            }
            if (!A132.isEmpty()) {
                A13.add(TextUtils.join(" ", A132));
            }
            if (A13.size() > 3) {
                if (A13.size() <= 3) {
                    A09 = AnonymousClass3MW.A09(TextUtils.join("\n", A13));
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append(this.A00);
                    String A0y = AnonymousClass000.A0y(this.A02, A10);
                    StringBuilder A102 = AnonymousClass000.A10();
                    int i7 = 0;
                    while (true) {
                        String str2 = (String) A13.get(i7);
                        if (i7 != 2) {
                            A102.append(str2);
                            A102.append("\n");
                            i7++;
                            if (i7 >= 3) {
                                break;
                            }
                        } else {
                            A102.append(str2.subSequence(0, Math.max(0, str2.length() - A0y.length())));
                            A102.append(A0y);
                            break;
                        }
                    }
                    String obj = A102.toString();
                    A09 = AnonymousClass3MW.A09(obj);
                    A09.setSpan(new C72693Nd(this, 1), obj.indexOf(A0y), obj.length(), 0);
                }
                if (!A18.equals(A09.toString())) {
                    setMovementMethod(LinkMovementMethod.getInstance());
                    super.setText(A09, TextView.BufferType.SPANNABLE);
                }
            } else {
                String join = TextUtils.join("\n", A13);
                if (!A18.equals(join)) {
                    super.setText(join);
                }
            }
        }
        super.onMeasure(i3, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.A03 = bundle.getBoolean("is_expanded");
            String string = bundle.getString("original_text");
            if (string == null) {
                string = "";
            }
            this.A01 = string;
            parcelable = bundle.getParcelable("super_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setText(String str) {
        this.A01 = str;
        super.setText(str);
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0F();
    }

    private void A0F() {
        this.A00 = getContext().getString(2131895588);
        this.A02 = getContext().getString(2131895589);
        this.A01 = AnonymousClass3MZ.A18(this);
        Paint paint = this.A04;
        paint.setTextSize(getTextSize());
        paint.setTypeface(getTypeface());
    }

    public static void A0G(Paint paint, String str, ArrayList arrayList, ArrayList arrayList2, int i) {
        arrayList2.add(str);
        if (paint.measureText(TextUtils.join(" ", arrayList2)) >= ((float) i)) {
            arrayList2.remove(arrayList2.size() - 1);
            arrayList.add(TextUtils.join(" ", arrayList2));
            arrayList2.clear();
            arrayList2.add(str);
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("super_state", super.onSaveInstanceState());
        A0D.putBoolean("is_expanded", this.A03);
        A0D.putString("original_text", this.A01);
        return A0D;
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0F();
    }

    public SeeMoreTextView(Context context) {
        super(context);
        A0F();
    }
}
