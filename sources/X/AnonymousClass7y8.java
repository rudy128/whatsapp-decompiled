package X;

import android.graphics.Bitmap;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7y8  reason: invalid class name */
public final class AnonymousClass7y8 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiImagineBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7y8(AiImagineBottomSheet aiImagineBottomSheet) {
        super(1);
        this.this$0 = aiImagineBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C130296jC r7 = (C130296jC) obj;
        AiImagineBottomSheet aiImagineBottomSheet = this.this$0;
        AnonymousClass3Ma.A1M(aiImagineBottomSheet.A0V);
        boolean z = false;
        AiImagineBottomSheet.A0F(aiImagineBottomSheet, false, false);
        C111225jD r0 = aiImagineBottomSheet.A0J;
        Bitmap bitmap = null;
        if (r0 != null) {
            Boolean bool = (Boolean) r0.A0K.A06();
            if (bool == null) {
                bool = false;
            }
            AiImagineBottomSheet.A0D(aiImagineBottomSheet, bool.booleanValue());
            C111225jD r02 = aiImagineBottomSheet.A0J;
            if (r02 != null) {
                if (r02.A0D) {
                    if (r7 != null) {
                        z = true;
                    }
                    AiImagineBottomSheet.A0C(aiImagineBottomSheet, z);
                } else {
                    AiImagineBottomSheet.A0C(aiImagineBottomSheet, true);
                }
                if (!C108995ce.A1V(aiImagineBottomSheet)) {
                    ShapeableImageView shapeableImageView = aiImagineBottomSheet.A0D;
                    if (shapeableImageView != null) {
                        if (r7 != null) {
                            bitmap = r7.A00;
                        }
                        shapeableImageView.setImageBitmap(bitmap);
                    }
                } else {
                    C111225jD r03 = aiImagineBottomSheet.A0J;
                    if (r03 != null) {
                        if (r03.A0U.A06() == AnonymousClass6RH.SELECTING_OPTION) {
                            AiImagineBottomSheet.A0A(aiImagineBottomSheet, r7);
                            C111225jD r04 = aiImagineBottomSheet.A0J;
                            if (r04 != null) {
                                if (r04.A0D) {
                                    AiImagineBottomSheet.A02(aiImagineBottomSheet);
                                } else {
                                    AiImagineBottomSheet.A03(aiImagineBottomSheet);
                                }
                            }
                        }
                        if (r7 != null) {
                            C111225jD r05 = aiImagineBottomSheet.A0J;
                            if (r05 != null) {
                                List A10 = AnonymousClass3MW.A10(r05.A0T);
                                if (A10 != null) {
                                    Iterator it = A10.iterator();
                                    int i = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i = -1;
                                            break;
                                        }
                                        C130296jC r06 = ((C127036dh) it.next()).A00;
                                        if (r06 != null) {
                                            str = r06.A03;
                                        } else {
                                            str = null;
                                        }
                                        if (C18070vi.A18(str, r7.A03)) {
                                            break;
                                        }
                                        i++;
                                    }
                                    Integer valueOf = Integer.valueOf(i);
                                    if (valueOf != null) {
                                        int intValue = valueOf.intValue();
                                        ViewPager2 viewPager2 = aiImagineBottomSheet.A0C;
                                        if (viewPager2 != null) {
                                            viewPager2.A03(intValue, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int i2 = aiImagineBottomSheet.A00;
                if (i2 == 6 || i2 == 5) {
                    AiImagineBottomSheet.A08(aiImagineBottomSheet);
                }
                return C27621Wu.A00;
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }
}
