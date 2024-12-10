package X;

import android.text.Editable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.util.List;

/* renamed from: X.78t  reason: invalid class name and case insensitive filesystem */
public class C1422578t implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1422578t(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnTouchListener(new C1422578t(obj, obj2, i));
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector;
        AnonymousClass8B2 r3;
        VoiceRecordingView voiceRecordingView;
        float A03;
        float f;
        C43191zP r7;
        double ceil;
        switch (this.A00) {
            case 0:
                C116185wX r32 = (C116185wX) this.A01;
                AnonymousClass70A r1 = (AnonymousClass70A) this.A02;
                if (!r1.A0L || (scaleGestureDetector = r32.A01) == null || !scaleGestureDetector.onTouchEvent(motionEvent)) {
                    if (!r1.A0T && !r1.A0U) {
                        return false;
                    }
                    boolean z = r1.A0J;
                    boolean A0b = C40811vJ.A0b(r32.A0U, r32.A0a);
                    if (z && A0b) {
                        return false;
                    }
                    r32.A0F(motionEvent, r32.A0F);
                    return false;
                } else if (r1.A0T || r1.A0U) {
                    return false;
                } else {
                    return true;
                }
            case 1:
                C116165wV r33 = (C116165wV) this.A01;
                boolean z2 = ((AnonymousClass70A) this.A02).A0J;
                boolean A0b2 = C40811vJ.A0b(r33.A0O, r33.A0Q);
                if (!z2 || !A0b2) {
                    r33.A0F(motionEvent, r33.A0A);
                    break;
                }
            case 2:
                C113295mr r72 = (C113295mr) this.A01;
                AnonymousClass8A8 r2 = (AnonymousClass8A8) this.A02;
                AnonymousClass3MX.A1O(r72);
                if (motionEvent.getAction() == 1) {
                    AnonymousClass65B r5 = r72.A03;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (r5.A0C && r5.A0B) {
                        float A032 = C108945cZ.A03(r5) - (r5.A00 * 2.0f);
                        float f2 = r5.A03;
                        float A033 = C108945cZ.A03(r5);
                        float f3 = (r5.A01 * 2.0f) + f2;
                        if (x > A032 - f2 && x < A033 && y > 0.0f && y < f3 && (r3 = r5.A08) != null) {
                            r72.A02 = true;
                            if (r2 instanceof MediaPickerFragment) {
                                MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) r2;
                                if ((r5.A0A() || !C72453Mb.A1a(mediaPickerFragment.A0S)) && !AnonymousClass000.A1W(mediaPickerFragment.A04)) {
                                    mediaPickerFragment.A2J();
                                    mediaPickerFragment.A2L(r3);
                                    return true;
                                }
                            } else if (r2 instanceof GalleryRecentsFragment) {
                                GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) r2;
                                Boolean bool = null;
                                if (!r5.A0A() && C72453Mb.A1a(galleryRecentsFragment.A0H)) {
                                    return false;
                                }
                                GalleryTabHostFragment galleryTabHostFragment = galleryRecentsFragment.A02;
                                if (galleryTabHostFragment != null) {
                                    bool = Boolean.valueOf(galleryTabHostFragment.A2A());
                                }
                                if (C18070vi.A19(bool, true)) {
                                    return GalleryRecentsFragment.A03(galleryRecentsFragment, r3);
                                }
                                return false;
                            }
                        }
                    }
                }
                break;
            case 3:
                Object obj = this.A01;
                C130106it r0 = (C130106it) this.A02;
                C18070vi.A0h(obj, r0);
                view.performClick();
                PopupWindow popupWindow = r0.A02;
                if (!popupWindow.isShowing()) {
                    return true;
                }
                popupWindow.dismiss();
                return true;
            case 4:
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                C120196Ct r22 = (C120196Ct) this.A01;
                r22.A03.performClick();
                r22.A04(r22.A01, C120196Ct.A00(r22, (List) this.A02));
                return true;
            case 5:
                AnonymousClass17O r6 = (AnonymousClass17O) this.A01;
                GestureDetector gestureDetector = (GestureDetector) this.A02;
                C18070vi.A0d(gestureDetector, 1);
                if (motionEvent.getAction() == 0) {
                    r6.A00 = 0.0f;
                    C43191zP r23 = r6.A04;
                    if (r23 != null) {
                        r23.A05 = true;
                        r23.A01(1.0d);
                    }
                }
                gestureDetector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                    return true;
                }
                C43191zP r24 = r6.A04;
                if (r24 != null) {
                    r24.A05 = false;
                    r24.A01(0.0d);
                }
                float abs = Math.abs(r6.A00);
                ImageView imageView = r6.A03;
                if (imageView == null) {
                    A03 = 0.0f;
                } else {
                    A03 = abs / (C108945cZ.A03(imageView) * 3.0f);
                    if (A03 > 0.5f) {
                        A03 = 0.5f;
                    }
                }
                float signum = A03 * Math.signum(r6.A00);
                C43191zP r8 = r6.A05;
                if (r8 != null) {
                    double d = (double) signum;
                    C43201zQ r34 = r8.A07;
                    if (d != r34.A01) {
                        r34.A01 = d;
                        r8.A0A.A02(r8.A0B);
                    }
                }
                ImageView imageView2 = r6.A03;
                if (imageView2 != null) {
                    f = imageView2.getRotationY();
                } else {
                    f = 0.0f;
                }
                float f4 = f % 180.0f;
                double d2 = (double) signum;
                if (d2 <= 0.0d) {
                    if (d2 >= 0.0d) {
                        if (f4 < 90.0f) {
                            if (f4 >= 90.0f) {
                                return true;
                            }
                        }
                    }
                    r7 = r6.A05;
                    if (r7 == null) {
                        return true;
                    }
                    double d3 = r7.A07.A00;
                    if (d3 % 1.0d == 0.0d) {
                        ceil = d3 - 1.0d;
                    } else {
                        ceil = Math.floor(d3);
                    }
                    r7.A01(ceil);
                    return true;
                }
                r7 = r6.A05;
                if (r7 == null) {
                    return true;
                }
                double d4 = r7.A07.A00;
                if (d4 % 1.0d == 0.0d) {
                    ceil = d4 + 1.0d;
                } else {
                    ceil = Math.ceil(d4);
                }
                r7.A01(ceil);
                return true;
            case 6:
                ((CIZ) this.A02).A00.onTouchEvent(motionEvent);
                return true;
            case 7:
                AnonymousClass70O r4 = (AnonymousClass70O) this.A01;
                View view2 = (View) this.A02;
                C18070vi.A0d(motionEvent, 3);
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 3) {
                            r4.A0C();
                            break;
                        }
                    } else {
                        view2.performClick();
                        break;
                    }
                } else {
                    r4.A0E();
                    return true;
                }
                break;
            case 8:
                TextStatusComposerFragment textStatusComposerFragment = (TextStatusComposerFragment) this.A01;
                CIZ ciz = (CIZ) this.A02;
                C18070vi.A0d(ciz, 1);
                StatusEditText statusEditText = textStatusComposerFragment.A0l;
                if (statusEditText != null) {
                    if (statusEditText.getVisibility() == 0) {
                        StatusEditText statusEditText2 = textStatusComposerFragment.A0l;
                        if (statusEditText2 != null) {
                            Editable text = statusEditText2.getText();
                            if ((text == null || text.length() == 0) && ((voiceRecordingView = textStatusComposerFragment.A0p) == null || voiceRecordingView.getVisibility() != 0)) {
                                ciz.A00.onTouchEvent(motionEvent);
                                break;
                            }
                        }
                    }
                }
                C18070vi.A11("entry");
                throw null;
            default:
                AnonymousClass6IG r25 = (AnonymousClass6IG) this.A01;
                C42011xT r12 = (C42011xT) this.A02;
                if (motionEvent.getActionMasked() == 0) {
                    r25.A00.A01.A0A(r12);
                    break;
                }
                break;
        }
        return false;
    }
}
