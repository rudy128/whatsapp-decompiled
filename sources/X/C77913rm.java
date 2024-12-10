package X;

import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.text.Editable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.bot.commands.BotCommandsPickerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.3rm  reason: invalid class name and case insensitive filesystem */
public abstract class C77913rm extends AnonymousClass3gm implements C108455bj {
    public View A00;
    public View A01;
    public AnonymousClass4ZT A02;
    public AnonymousClass11C A03;
    public C18030ve A04;
    public int A05;
    public ValueAnimator A06;

    public double getAvailableScreenHeightPercentage() {
        return 0.5d;
    }

    public abstract View getContentView();

    public static void A03(C77913rm r2) {
        if (r2.A00 != null) {
            ViewGroup.LayoutParams layoutParams = r2.getContentView().getLayoutParams();
            layoutParams.width = r2.A00.getWidth();
            r2.getContentView().setLayoutParams(layoutParams);
        }
    }

    public void A07(int i, int i2) {
        int i3;
        if (i != 0) {
            if (C18020vd.A05(C18040vf.A02, this.A04, 571)) {
                i3 = i2 * Math.min(2, i);
            } else {
                int A052 = A05(i2) / i2;
                if (i > A052) {
                    i3 = (A052 * i2) + ((int) (((double) i2) * 0.5d));
                } else {
                    i3 = i2 * i;
                }
            }
            if (i3 != 0) {
                A08(i3, false);
                return;
            }
        }
        if (getVisibility() == 0) {
            A08(0, false);
        }
    }

    public void A08(int i, boolean z) {
        int i2;
        long j;
        int i3 = this.A05;
        if (i != i3) {
            if (i3 <= 0 && i > 0) {
                AnonymousClass1Y5.A00(getContext(), this.A03, getContext().getText(2131888973));
            }
            this.A05 = i;
            ValueAnimator valueAnimator = this.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (AnonymousClass000.A1P(getVisibility())) {
                i2 = getHeight();
            } else {
                i2 = 0;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i2, i});
            this.A06 = ofInt;
            C88754aj.A00(ofInt, this, 12);
            this.A06.addListener(new C72503Mh(this, i, 0));
            ValueAnimator valueAnimator2 = this.A06;
            if (z) {
                j = 0;
            } else {
                j = 250;
            }
            valueAnimator2.setDuration(j);
            this.A06.start();
        }
    }

    public void A09(boolean z) {
        AnonymousClass4ZT r0 = this.A02;
        r0.A00.A0G(Boolean.valueOf(!r0.A02.isEmpty()));
    }

    public void BJu() {
        AnonymousClass3UN r0;
        if (this instanceof C77883re) {
            C77883re r02 = (C77883re) this;
            AnonymousClass3V2 r3 = r02.A01;
            MentionableEntry mentionableEntry = r02.A02;
            Editable editableText = mentionableEntry.getEditableText();
            UserJid botMention = mentionableEntry.getBotMention();
            r3.A00 = true;
            if (r3.A0V()) {
                r3.A0U(editableText, botMention);
                return;
            }
            C108725cC A0T = r3.A0T();
            if (A0T != null) {
                A0T.Bqz();
            }
        } else if ((this instanceof BotCommandsPickerView) && (r0 = ((BotCommandsPickerView) this).A03) != null) {
            C41111vp r4 = r0.A05;
            AnonymousClass4YU r03 = (AnonymousClass4YU) r4.A06();
            r4.A0F(new AnonymousClass4YU(r03.A00, r03.A01, r03.A02, true));
        }
    }

    public int getAnchorWidth() {
        return this.A00.getWidth();
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != null && getVisibility() == 0) {
            C90584eJ.A00(getViewTreeObserver(), this, 17);
        }
    }

    public void setAnchorWidthView(View view) {
        this.A00 = view;
        A03(this);
    }

    private int getActionBarSize() {
        TypedArray obtainStyledAttributes = AnonymousClass3Ma.A06(this).obtainStyledAttributes(new int[]{16843499});
        try {
            return (int) obtainStyledAttributes.getDimension(0, 0.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int A05(int i) {
        int actionBarSize = getActionBarSize();
        Display defaultDisplay = AnonymousClass11C.A01(getContext()).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.y;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        View view = this.A01;
        if (view == null) {
            view = (View) getParent().getParent();
            this.A01 = view;
        }
        view.getLocationOnScreen(iArr2);
        double d = (double) i;
        return Math.min((int) (((((double) i2) * getAvailableScreenHeightPercentage()) - ((double) actionBarSize)) - ((double) ((int) (d * 1.25d)))), (AnonymousClass3MW.A02(this, iArr[1]) - iArr2[1]) - ((int) (d * 0.6d)));
    }

    public final void A06() {
        boolean BEB = BEB();
        AnonymousClass4ZT r4 = this.A02;
        AnonymousClass4DV type = getType();
        if (BEB) {
            C18070vi.A0d(type, 0);
            C108455bj r3 = (C108455bj) r4.A01.get(type);
            if (r3 != null) {
                PriorityQueue priorityQueue = r4.A02;
                C108455bj r2 = (C108455bj) C72473Md.A0i(priorityQueue);
                if (!C18070vi.A18(r2, r3)) {
                    if (!priorityQueue.contains(r3)) {
                        priorityQueue.add(r3);
                        if (r2 == null) {
                            AnonymousClass4ZT.A00((C108455bj) null, r3, r4, C106425Vu.A00);
                        } else {
                            int A002 = C87444Vp.A00(r3, r2);
                            if (A002 < 0) {
                                r3.Bcx(true);
                                return;
                            }
                            if (A002 > 0) {
                                r2.Bcx(true);
                            }
                            AnonymousClass4ZT.A00(r2, r3, r4, C106425Vu.A00);
                        }
                    } else {
                        return;
                    }
                }
                r3.CMX();
                return;
            }
            return;
        }
        r4.A02(type, false);
    }

    public void Bcx(boolean z) {
        if (getVisibility() == 0) {
            A08(0, z);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HashMap hashMap = this.A02.A01;
        AnonymousClass4DV type = getType();
        hashMap.containsKey(type);
        hashMap.put(type, this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass4ZT r3 = this.A02;
        HashMap hashMap = r3.A01;
        AnonymousClass4DV type = getType();
        if (hashMap.containsKey(type)) {
            r3.A02(type, false);
            hashMap.remove(type);
        }
    }

    public void setConstraintParentView(View view) {
        this.A01 = view;
    }
}
