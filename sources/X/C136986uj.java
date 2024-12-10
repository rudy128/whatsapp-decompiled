package X;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import java.util.List;

/* renamed from: X.6uj  reason: invalid class name and case insensitive filesystem */
public class C136986uj {
    public float A00 = 1.0f;
    public int A01 = -13381889;
    public AnimatorSet A02;
    public Rect A03 = AnonymousClass3MW.A07();
    public C136926ud A04;
    public AnonymousClass7JF A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B;
    public CoordinatorLayout A0C;
    public final ValueAnimator A0D;
    public final Animation A0E;
    public final Animation A0F;
    public final AnonymousClass7JS A0G;
    public final C126056c7 A0H;
    public final TitleBarView A0I;
    public final C20050A4v A0J;

    public void A07(int i) {
        if (i == 2 && this.A0G.A09() == 2) {
            A09(this.A01, this.A00);
            return;
        }
        AnonymousClass7JS r1 = this.A0G;
        if (r1.A09() == i) {
            i = 0;
        }
        r1.A0E(i);
    }

    public AnimatorSet A00(boolean z) {
        float x;
        float x2;
        long j;
        TimeInterpolator r0;
        AnimatorSet animatorSet = this.A02;
        if (animatorSet != null) {
            animatorSet.end();
        }
        AnimatorSet A0B2 = C108945cZ.A0B();
        this.A06 = AnonymousClass000.A13();
        TitleBarView titleBarView = this.A0I;
        float shapeToolOffsetX = titleBarView.getShapeToolOffsetX();
        float textToolOffsetX = titleBarView.getTextToolOffsetX();
        float cropToolOffsetX = titleBarView.getCropToolOffsetX();
        AnonymousClass7JS r18 = this.A0G;
        int A092 = r18.A09();
        ImageView imageView = titleBarView.A0C;
        if (imageView == null) {
            x2 = 0.0f;
        } else {
            if (imageView.getVisibility() == 8 || A092 != 1) {
                ImageView imageView2 = titleBarView.A09;
                if (imageView2 == null) {
                    C18070vi.A11("penTool");
                    throw null;
                }
                x = imageView2.getX();
            } else {
                WaTextView waTextView = titleBarView.A0G;
                if (waTextView != null) {
                    float x3 = waTextView.getX();
                    WaTextView waTextView2 = titleBarView.A0G;
                    if (waTextView2 != null) {
                        x = x3 - waTextView2.getTranslationX();
                    }
                }
                C18070vi.A11("textTool");
                throw null;
            }
            x2 = (x - imageView.getX()) - imageView.getTranslationX();
        }
        float mediaSettingsToolOffsetX = titleBarView.getMediaSettingsToolOffsetX();
        titleBarView.getTemplateToolOffsetX();
        float musicToolOffsetX = titleBarView.getMusicToolOffsetX();
        C18030ve r11 = r18.A0C.A01;
        C18040vf r9 = C18040vf.A02;
        boolean z2 = !C18020vd.A05(r9, r11, 9237);
        long j2 = 0;
        boolean z3 = z;
        if (z2) {
            C1411074h.A00(A01(shapeToolOffsetX, 40, z3), this, 18);
            C1411074h.A00(A01(textToolOffsetX, 60, z3), this, 19);
            C1411074h.A00(A01(cropToolOffsetX, 20, z3), this, 20);
            C1411074h.A00(A01(x2, 20, z3), this, 21);
            C1411074h.A00(A01(mediaSettingsToolOffsetX, 20, z3), this, 22);
            if (r18.A0I()) {
                C1411074h.A00(A01(musicToolOffsetX, 20, z3), this, 23);
            }
        }
        float f = 1.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{C108975cc.A01(z3 ? 1 : 0), C108975cc.A00(z3)});
        ofFloat.addUpdateListener(new C1410574c(0, this, C18020vd.A05(r9, r11, 9237)));
        ValueAnimator valueAnimator = this.A0D;
        valueAnimator.setDuration(400);
        if (z) {
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new C23621Gz());
            if (z2) {
                this.A06.add(valueAnimator);
            }
        } else {
            ofFloat.setDuration(500);
        }
        this.A06.add(ofFloat);
        if (!(r18.A09() == 5 || r18.A09() == 2)) {
            float[] fArr = new float[2];
            fArr[0] = C108975cc.A01(z3);
            if (z) {
                f = 0.0f;
            }
            fArr[1] = f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            C1411074h.A00(ofFloat2, this, 24);
            if (z) {
                j = 100;
            } else {
                j = 300;
            }
            ofFloat2.setDuration(j);
            if (!z) {
                j2 = 100;
            }
            ofFloat2.setStartDelay(j2);
            if (z) {
                r0 = new AnonymousClass1YY();
            } else {
                r0 = new C23621Gz();
            }
            ofFloat2.setInterpolator(r0);
            this.A06.add(ofFloat2);
        }
        A0B2.playTogether(this.A06);
        A0B2.addListener(new C109035ci(this, z3));
        return A0B2;
    }

    public void A02() {
        TitleBarView titleBarView = this.A0I;
        Animation animation = this.A0E;
        View view = titleBarView.A02;
        if (view != null) {
            view.setVisibility(4);
            View view2 = titleBarView.A02;
            if (view2 != null) {
                view2.startAnimation(animation);
                return;
            }
        }
        C18070vi.A11("titleBar");
        throw null;
    }

    public void A06(float f, int i, boolean z, boolean z2) {
        this.A01 = i;
        this.A00 = f;
        boolean z3 = false;
        this.A09 = false;
        this.A0A = false;
        int A092 = this.A0G.A09();
        if (A092 == 0) {
            A05(f);
        } else if (A092 == 1) {
            if (i == 0 || !this.A09) {
                C109455dT r0 = this.A0I.A0Q;
                if (r0 == null) {
                    C18070vi.A11("penToolDrawable");
                    throw null;
                }
                r0.A00(i, f);
            } else {
                ValueAnimator valueAnimator = this.A0D;
                valueAnimator.addUpdateListener(new C1410774e(this, f, i, 1));
                C109195cy.A02(valueAnimator, this, 21);
                valueAnimator.start();
                this.A09 = false;
                this.A0A = true;
            }
            this.A0I.setPenToolDrawableStrokePreview(z);
        } else if (A092 == 2) {
            A09(i, f);
            if (z && z2) {
                z3 = true;
            }
            this.A0I.setShapeToolDrawableStrokePreview(z3);
        }
    }

    public void A08(int i) {
        if (i == 0) {
            AnonymousClass7JS r2 = this.A0G;
            if (r2.A09() == 5 || r2.A09() == 2) {
                return;
            }
        }
        this.A0I.setUndoButtonVisibility(i);
    }

    public void A09(int i, float f) {
        if (!this.A0A || i == 0) {
            C109455dT r0 = this.A0I.A0R;
            if (r0 != null) {
                r0.A00(i, f);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.A0D;
        valueAnimator.addUpdateListener(new C1410774e(this, f, i, 0));
        C109195cy.A02(valueAnimator, this, 21);
        AnimatorSet A002 = A00(true);
        this.A02 = A002;
        A002.start();
        this.A07 = true;
    }

    public void A0A(boolean z) {
        String str;
        TitleBarView titleBarView = this.A0I;
        ImageView imageView = titleBarView.A0A;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        WaTextView waTextView = titleBarView.A0G;
        if (waTextView == null) {
            str = "textTool";
        } else {
            waTextView.setEnabled(z);
            ImageView imageView2 = titleBarView.A09;
            if (imageView2 == null) {
                str = "penTool";
            } else {
                imageView2.setEnabled(z);
                ImageView imageView3 = titleBarView.A07;
                if (imageView3 != null) {
                    imageView3.setEnabled(z);
                    return;
                }
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A0B(boolean z) {
        TitleBarView titleBarView = this.A0I;
        int i = 2131232616;
        if (z) {
            i = 2131232617;
        }
        Drawable A002 = C24261Jm.A00(titleBarView.getContext(), i);
        if (A002 != null) {
            C109455dT r0 = titleBarView.A0O;
            if (r0 != null) {
                r0.A03 = A002;
                r0.invalidateSelf();
            }
            C18070vi.A11("mediaQualityButtonDrawable");
            throw null;
        }
        C109455dT r1 = titleBarView.A0O;
        if (r1 != null) {
            r1.A02 = titleBarView.A00;
            r1.A00 = 1.0f;
            r1.invalidateSelf();
            return;
        }
        C18070vi.A11("mediaQualityButtonDrawable");
        throw null;
    }

    public boolean A0C() {
        AnimatorSet animatorSet = this.A02;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return false;
        }
        return true;
    }

    public C136986uj(CoordinatorLayout coordinatorLayout, AnonymousClass7JS r6, C126056c7 r7, TitleBarView titleBarView, C20050A4v a4v) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A0E = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        this.A0F = alphaAnimation2;
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 1061997773;
        A1V[1] = 1065353216;
        this.A0D = ValueAnimator.ofFloat(A1V);
        this.A0C = coordinatorLayout;
        this.A0G = r6;
        this.A0I = titleBarView;
        this.A0H = r7;
        this.A0J = a4v;
        alphaAnimation.setDuration(300);
        alphaAnimation2.setDuration(300);
        titleBarView.A04(r6, this, C18020vd.A05(C18040vf.A02, r6.A0C.A01, 9237));
    }

    public ValueAnimator A01(float f, long j, boolean z) {
        TimeInterpolator A002;
        float[] A1V = C108945cZ.A1V();
        float f2 = -f;
        if (z) {
            f2 = 0.0f;
        }
        A1V[0] = f2;
        if (!z) {
            f = 0.0f;
        }
        A1V[1] = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
        if (z) {
            ofFloat.setDuration(300);
            A002 = new C23621Gz();
        } else {
            ofFloat.setDuration(500);
            ofFloat.setStartDelay(j);
            A002 = C29111bd.A00(0.5f, 1.35f, 0.4f, 1.0f);
        }
        ofFloat.setInterpolator(A002);
        this.A06.add(ofFloat);
        return ofFloat;
    }

    public void A03() {
        if (!A0C() && !this.A0D.isRunning() && !this.A0B && this.A05 != null) {
            C20050A4v a4v = this.A0J;
            AnonymousClass7JS r2 = this.A0G;
            C72463Mc.A1F(a4v, 80, r2.A06());
            int i = 6;
            if (r2.A09() == 6) {
                i = 0;
            }
            r2.A0E(i);
        }
    }

    public void A04() {
        AnimatorSet animatorSet;
        if (A0C() && this.A07) {
            this.A02.end();
        }
        if (!this.A08 || (animatorSet = this.A02) == null || animatorSet.isRunning()) {
            this.A0I.A03(this.A0F);
        } else {
            this.A02.start();
            this.A07 = false;
        }
        this.A08 = false;
    }

    public void A05(float f) {
        String str;
        A04();
        this.A0G.A0E(0);
        TitleBarView titleBarView = this.A0I;
        titleBarView.setShapeToolDrawableStrokePreview(false);
        titleBarView.setPenToolDrawableStrokePreview(false);
        ImageView imageView = titleBarView.A09;
        if (imageView == null) {
            str = "penTool";
        } else {
            imageView.setSelected(false);
            WaTextView waTextView = titleBarView.A0G;
            if (waTextView == null) {
                str = "textTool";
            } else {
                waTextView.setSelected(false);
                ImageView imageView2 = titleBarView.A0A;
                if (imageView2 != null) {
                    imageView2.setSelected(false);
                }
                ImageView imageView3 = titleBarView.A0B;
                if (imageView3 != null) {
                    imageView3.setSelected(false);
                }
                ImageView imageView4 = titleBarView.A07;
                if (imageView4 != null) {
                    imageView4.setSelected(false);
                }
                int i = titleBarView.A00;
                C109455dT r0 = titleBarView.A0R;
                if (r0 != null) {
                    r0.A00(i, f);
                }
                C109455dT r1 = titleBarView.A0T;
                if (r1 == null) {
                    str = "textToolDrawable";
                } else {
                    r1.A00(titleBarView.A00, f);
                    C109455dT r12 = titleBarView.A0Q;
                    if (r12 == null) {
                        str = "penToolDrawable";
                    } else {
                        r12.A00(titleBarView.A00, f);
                        C109455dT r13 = titleBarView.A0N;
                        if (r13 == null) {
                            str = "cropToolDrawable";
                        } else {
                            r13.A00(titleBarView.A00, f);
                            C109455dT r14 = titleBarView.A0U;
                            if (r14 != null) {
                                r14.A00(titleBarView.A00, f);
                            }
                            C109455dT r15 = titleBarView.A0M;
                            if (r15 == null) {
                                str = "closeButtonDrawable";
                            } else {
                                r15.A00(titleBarView.A00, f);
                                C109455dT r16 = titleBarView.A0O;
                                if (r16 == null) {
                                    str = "mediaQualityButtonDrawable";
                                } else {
                                    r16.A00(titleBarView.A00, f);
                                    C109455dT r17 = titleBarView.A0S;
                                    if (r17 != null) {
                                        r17.A00(titleBarView.A00, f);
                                    }
                                    C109455dT r18 = titleBarView.A0P;
                                    if (r18 != null) {
                                        r18.A00(titleBarView.A00, f);
                                    }
                                    titleBarView.setBackButtonDrawable(false);
                                    this.A09 = true;
                                    this.A0A = true;
                                    ImageView imageView5 = titleBarView.A09;
                                    String str2 = "penTool";
                                    if (imageView5 != null) {
                                        imageView5.setVisibility(0);
                                        WaTextView waTextView2 = titleBarView.A0G;
                                        if (waTextView2 != null) {
                                            waTextView2.setVisibility(0);
                                            ImageView imageView6 = titleBarView.A0A;
                                            if (imageView6 != null) {
                                                imageView6.setVisibility(0);
                                            }
                                            ImageView imageView7 = titleBarView.A0B;
                                            if (imageView7 != null) {
                                                imageView7.setVisibility(0);
                                            }
                                            FrameLayout frameLayout = titleBarView.A03;
                                            if (frameLayout != null) {
                                                frameLayout.setVisibility(0);
                                            }
                                            ImageView imageView8 = titleBarView.A0C;
                                            float f2 = 1.0f;
                                            if (imageView8 != null) {
                                                imageView8.setAlpha(1.0f);
                                            }
                                            ImageView imageView9 = titleBarView.A09;
                                            if (imageView9 != null) {
                                                imageView9.setAlpha(1.0f);
                                                WaTextView waTextView3 = titleBarView.A0G;
                                                if (waTextView3 != null) {
                                                    waTextView3.setAlpha(1.0f);
                                                    ImageView imageView10 = titleBarView.A05;
                                                    str2 = "cropTool";
                                                    if (imageView10 != null) {
                                                        imageView10.setAlpha(1.0f);
                                                        ImageView imageView11 = titleBarView.A0A;
                                                        if (imageView11 != null) {
                                                            imageView11.setAlpha(1.0f);
                                                        }
                                                        ImageView imageView12 = titleBarView.A0B;
                                                        if (imageView12 != null) {
                                                            imageView12.setAlpha(1.0f);
                                                        }
                                                        FrameLayout frameLayout2 = titleBarView.A03;
                                                        if (frameLayout2 != null) {
                                                            frameLayout2.setAlpha(1.0f);
                                                        }
                                                        ImageView imageView13 = titleBarView.A06;
                                                        if (imageView13 != null) {
                                                            if (!titleBarView.A0e) {
                                                                f2 = 0.4f;
                                                            }
                                                            imageView13.setAlpha(f2);
                                                        }
                                                        ImageView imageView14 = titleBarView.A05;
                                                        if (imageView14 != null) {
                                                            if (imageView14.getVisibility() != 8) {
                                                                ImageView imageView15 = titleBarView.A05;
                                                                if (imageView15 != null) {
                                                                    imageView15.setVisibility(0);
                                                                    return;
                                                                }
                                                            } else {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C18070vi.A11("textTool");
                                        throw null;
                                    }
                                    C18070vi.A11(str2);
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
