package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3SP;
import X.AnonymousClass78T;
import X.C108355bZ;
import X.C17960vV;
import X.C195309t8;
import X.C27691Xc;
import X.C43421zm;
import X.C72453Mb;
import X.C72463Mc;
import X.C85934Pl;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class DynamicButtonsLayout extends ViewGroup implements AnonymousClass009 {
    public C108355bZ A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final List A03;
    public final View[] A04;
    public final View[] A05;

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private View A01(int i) {
        int i2;
        C17960vV.A0C(true);
        View[] viewArr = this.A05;
        if (viewArr[i] == null) {
            if (i == 0) {
                i2 = 2131434290;
            } else if (i != 1) {
                if (i == 2) {
                    i2 = 2131434292;
                }
                View view = viewArr[i];
                C17960vV.A05(view);
                view.setBackground(this.A00.BZi(2));
            } else {
                i2 = 2131434291;
            }
            viewArr[i] = findViewById(i2);
            View view2 = viewArr[i];
            C17960vV.A05(view2);
            view2.setBackground(this.A00.BZi(2));
        }
        return viewArr[i];
    }

    private View A02(int i) {
        int i2;
        C17960vV.A0C(true);
        View[] viewArr = this.A04;
        if (viewArr[i] == null) {
            if (i != 0) {
                i2 = 2131434288;
                if (i != 1) {
                    if (i == 2) {
                        i2 = 2131434289;
                    }
                    C43421zm.A04((TextView) viewArr[i]);
                }
            } else {
                i2 = 2131434287;
            }
            viewArr[i] = findViewById(i2);
            C43421zm.A04((TextView) viewArr[i]);
        }
        return viewArr[i];
    }

    public static int A00(View view) {
        if (view == null) {
            return 0;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 11.0f, AnonymousClass3Ma.A09(view));
        int textSize = (int) ((TextView) view).getTextSize();
        return Math.max((applyDimension * 2) + textSize, (int) TypedValue.applyDimension(1, 40.0f, AnonymousClass3Ma.A09(view)));
    }

    private boolean A03(int i, int i2) {
        if (this.A03.size() != 2) {
            return false;
        }
        View[] viewArr = this.A04;
        int i3 = i2 * 2;
        if (viewArr[0].getMeasuredWidth() > (i / 2) - i3 || viewArr[1].getMeasuredWidth() > (i / 2) - i3) {
            return false;
        }
        return true;
    }

    public void A05(C85934Pl r8, List list) {
        boolean z;
        View view;
        View view2;
        List list2 = this.A03;
        list2.clear();
        int min = Math.min(3, list.size());
        for (int i = 0; i < min; i++) {
            list2.add(list.get(i));
        }
        int i2 = 0;
        do {
            if (list2.size() > i2) {
                z = true;
                view = A02(i2);
                view2 = A01(i2);
            } else {
                z = false;
                view = this.A05[i2];
                view2 = this.A04[i2];
            }
            if (!(view == null || view2 == null)) {
                int i3 = 8;
                view.setVisibility(C72453Mb.A0J(z));
                if (z) {
                    i3 = 0;
                }
                view2.setVisibility(i3);
            }
            if (z) {
                TextView textView = (TextView) A02(i2);
                textView.setVisibility(0);
                textView.setText(((C195309t8) list2.get(i2)).A03);
                textView.setSelected(((C195309t8) list2.get(i2)).A00);
                View A012 = A01(i2);
                A012.setVisibility(0);
                if (((C195309t8) list2.get(i2)).A00) {
                    A012.setClickable(false);
                } else {
                    A012.setClickable(true);
                    A012.setOnClickListener(new AnonymousClass78T(this, i2, 9, r8));
                }
                A012.setContentDescription(((C195309t8) list2.get(i2)).A03);
                A012.setLongClickable(true);
                AnonymousClass1HF.A0f(A012, new AnonymousClass3SP(this, i2));
            }
            i2++;
        } while (i2 < 3);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, AnonymousClass3Ma.A09(this));
        int applyDimension2 = (int) TypedValue.applyDimension(1, 2.0f, AnonymousClass3Ma.A09(this));
        int right = getRight() - getLeft();
        View[] viewArr = this.A04;
        int i5 = 0;
        int A002 = A00(viewArr[0]);
        boolean A032 = A03(getMeasuredWidth(), applyDimension);
        int i6 = applyDimension2 / 2;
        int i7 = i6;
        do {
            View view = viewArr[i5];
            if (view != null) {
                View[] viewArr2 = this.A05;
                if (viewArr2[i5] != null && view.getVisibility() == 0) {
                    if (i5 != 0 || !A032) {
                        int width = getWidth();
                        View view2 = viewArr[i5];
                        View view3 = viewArr2[i5];
                        int max = Math.max((right - view2.getMeasuredWidth()) / 2, applyDimension);
                        int measuredHeight = (A002 - view2.getMeasuredHeight()) / 2;
                        view3.layout(-applyDimension2, i6, width + applyDimension2, A002 + i6 + applyDimension2);
                        int i8 = i6 + measuredHeight;
                        view2.layout(max, i8, width - max, view2.getMeasuredHeight() + i8 + applyDimension2);
                        i5++;
                    } else {
                        int width2 = getWidth();
                        View view4 = viewArr[0];
                        View view5 = viewArr2[0];
                        View view6 = viewArr[1];
                        View view7 = viewArr2[1];
                        int i9 = width2 / 2;
                        int measuredHeight2 = (A002 - view4.getMeasuredHeight()) / 2;
                        int measuredHeight3 = (A002 - view6.getMeasuredHeight()) / 2;
                        int max2 = Math.max((i9 - view4.getMeasuredWidth()) / 2, applyDimension);
                        int max3 = Math.max((i9 - view6.getMeasuredWidth()) / 2, applyDimension);
                        int i10 = A002 + i6 + applyDimension2;
                        view5.layout(-applyDimension2, i6, i7 + i9, i10);
                        view7.layout(i9 - i7, i6, width2 + applyDimension2, i10);
                        view4.layout(max2, measuredHeight2 + i6, i9 - max2, measuredHeight2 + view4.getMeasuredHeight() + i6);
                        view6.layout(i9 + max3, measuredHeight3 + i6, width2 - max3, measuredHeight3 + view4.getMeasuredHeight() + i6);
                        i5 = 2;
                    }
                    i6 += A002;
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (i5 < 3);
    }

    public int A04(int i) {
        View[] viewArr;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, AnonymousClass3Ma.A09(this));
        int i2 = 0;
        do {
            viewArr = this.A04;
            View view = viewArr[i2];
            if (view != null) {
                View[] viewArr2 = this.A05;
                if (viewArr2[i2] != null && view.getVisibility() == 0) {
                    viewArr[i2].measure(View.MeasureSpec.makeMeasureSpec(i - (applyDimension * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    C72463Mc.A12(viewArr2[i2]);
                }
            }
            i2++;
        } while (i2 < 3);
        boolean A032 = A03(i, applyDimension);
        int size = this.A03.size();
        if (A032) {
            size--;
        }
        int A002 = A00(viewArr[0]) * size;
        if (A002 != 0) {
            A002 += (int) TypedValue.applyDimension(1, 1.0f, AnonymousClass3Ma.A09(this));
        }
        AnonymousClass3MY.A1C(this, A002, 1073741824, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        return A002;
    }

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = AnonymousClass3MZ.A0V(((C27691Xc) ((AnonymousClass033) generatedComponent())).A0z);
        }
        this.A04 = new View[3];
        this.A05 = new View[3];
        this.A03 = AnonymousClass000.A13();
        View.inflate(context, 2131627178, this);
    }

    public DynamicButtonsLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
