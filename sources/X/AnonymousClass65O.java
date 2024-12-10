package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.65O  reason: invalid class name */
public class AnonymousClass65O extends C112325lI implements AnonymousClass8AZ {
    public final MediaGalleryFragmentBase A00;

    public AnonymousClass65O(C18030ve r10, AnonymousClass8A8 r11, MediaGalleryFragmentBase mediaGalleryFragmentBase, AnonymousClass10I r13, AnonymousClass00H r14) {
        super(r10, (AnonymousClass18K) null, r11, mediaGalleryFragmentBase, r13, r14, (AnonymousClass00H) null, (Integer) null);
        this.A00 = mediaGalleryFragmentBase;
    }

    public /* bridge */ /* synthetic */ C42011xT BqT(ViewGroup viewGroup) {
        C18070vi.A0d(viewGroup, 0);
        List list = C42011xT.A0I;
        C18000vb r3 = this.A00.A0E;
        if (r3 != null) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131625961, viewGroup, false);
            C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            inflate.setLayoutDirection(AnonymousClass3MY.A1b(r3) ^ true ? 1 : 0);
            inflate.setClickable(false);
            C113085mW r32 = new C113085mW(inflate);
            TextView textView = r32.A01;
            AnonymousClass3MX.A1C(textView.getContext(), textView, 2131101072);
            return r32;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public static final void A01(C113085mW r6, AnonymousClass65O r7, StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment, int i) {
        int i2;
        AnonymousClass8B2 r1;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = r7.A00;
        if (mediaGalleryFragmentBase.A0S && mediaGalleryFragmentBase.A0G != null) {
            boolean isChecked = r6.A00.isChecked();
            C160878Ah r0 = mediaGalleryFragmentBase.A0G;
            int i3 = 0;
            if (r0 != null) {
                i2 = r0.getCount();
            } else {
                i2 = 0;
            }
            int i4 = i2 - 1;
            int i5 = mediaGalleryFragmentBase.A03;
            if (i5 == 0 || i5 == 1) {
                int i6 = 0;
                while (i3 < i) {
                    int A002 = C112325lI.A00(mediaGalleryFragmentBase, i3);
                    if (i3 == i) {
                        i4 = (A002 + i6) - 1;
                    } else {
                        i6 += A002;
                    }
                    i3++;
                }
                i3 = i6;
            }
            ArrayList A13 = AnonymousClass000.A13();
            if (i3 <= i4) {
                while (true) {
                    C160878Ah r02 = mediaGalleryFragmentBase.A0G;
                    if (r02 != null) {
                        r1 = r02.BUY(i3);
                    } else {
                        r1 = null;
                    }
                    if (r1 instanceof AnonymousClass7H2) {
                        A13.add(((AnonymousClass7H2) r1).A01);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3++;
                }
            }
            if (isChecked) {
                storageUsageMediaGalleryFragment.A2I(A13);
            } else if (!A13.isEmpty()) {
                C108875cR A003 = StorageUsageMediaGalleryFragment.A00(storageUsageMediaGalleryFragment);
                if (A003 != null) {
                    A003.CKg(A13, false);
                }
                storageUsageMediaGalleryFragment.A2B();
            }
        }
    }

    public int BPU(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00;
        int i2 = mediaGalleryFragmentBase.A03;
        if (i2 == 0 || i2 == 1) {
            return C112325lI.A00(mediaGalleryFragmentBase, i);
        }
        return mediaGalleryFragmentBase.A01;
    }

    public int BSM() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00;
        int i = mediaGalleryFragmentBase.A03;
        if (i == 0 || i == 1) {
            return mediaGalleryFragmentBase.A0b.size();
        }
        return 1;
    }

    public long BSN(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00;
        int i2 = mediaGalleryFragmentBase.A03;
        if (i2 == 0 || i2 == 1) {
            return -((Calendar) ((AnonymousClass87A) mediaGalleryFragmentBase.A0b.get(i))).getTimeInMillis();
        }
        return 1;
    }

    public /* bridge */ /* synthetic */ void Bma(C42011xT r8, int i) {
        boolean z;
        TextView textView;
        int i2;
        C113085mW r82 = (C113085mW) r8;
        int i3 = 0;
        C18070vi.A0d(r82, 0);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00;
        int i4 = mediaGalleryFragmentBase.A03;
        if (i4 == 0 || i4 == 1) {
            r82.A01.setText(mediaGalleryFragmentBase.A0b.get(i).toString());
        } else {
            if (i4 == 2) {
                textView = r82.A01;
                i2 = 2131896161;
            } else if (i4 == 3) {
                textView = r82.A01;
                i2 = 2131899439;
            }
            textView.setText(i2);
        }
        if (mediaGalleryFragmentBase.A0T) {
            CheckBox checkBox = r82.A00;
            checkBox.setVisibility(0);
            checkBox.setEnabled(mediaGalleryFragmentBase.A0S);
            C160878Ah r1 = mediaGalleryFragmentBase.A0G;
            if (r1 != null && mediaGalleryFragmentBase.A0S) {
                int count = r1.getCount() - 1;
                int i5 = mediaGalleryFragmentBase.A03;
                if ((i5 == 0 || i5 == 1) && i >= 0) {
                    int i6 = 0;
                    while (true) {
                        if (i6 == i) {
                            count = (C112325lI.A00(mediaGalleryFragmentBase, i6) + i3) - 1;
                        } else {
                            i3 += C112325lI.A00(mediaGalleryFragmentBase, i6);
                        }
                        if (i6 == i) {
                            break;
                        }
                        i6++;
                    }
                }
                if (i3 <= count) {
                    while (true) {
                        if (mediaGalleryFragmentBase.A2H(i3)) {
                            if (i3 == count) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                checkBox.setChecked(z);
                AnonymousClass78T.A00(checkBox, this, r82, i, 17);
                return;
            }
            z = false;
            checkBox.setChecked(z);
            AnonymousClass78T.A00(checkBox, this, r82, i, 17);
            return;
        }
        r82.A00.setVisibility(8);
        r82.A0H.setOnClickListener((View.OnClickListener) null);
    }

    public /* bridge */ /* synthetic */ boolean C6y(MotionEvent motionEvent, C42011xT r6, int i) {
        C113085mW r62 = (C113085mW) r6;
        C18070vi.A0i(r62, motionEvent);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00;
        if (!mediaGalleryFragmentBase.A0T) {
            return false;
        }
        float x = motionEvent.getX();
        CheckBox checkBox = r62.A00;
        if (x < checkBox.getX() || !mediaGalleryFragmentBase.A0S) {
            return false;
        }
        checkBox.setChecked(!checkBox.isChecked());
        A01(r62, this, (StorageUsageMediaGalleryFragment) mediaGalleryFragmentBase, i);
        return true;
    }
}
