package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingViewModel;
import com.whatsapp.infra.graphql.generated.aivoice.enums.GraphQLXFBGenAIVoiceCategory;
import java.util.List;

/* renamed from: X.5lA  reason: invalid class name and case insensitive filesystem */
public final class C112245lA extends C38391rD {
    public static final List A03;
    public final Context A00;
    public final MetaAiVoiceSettingViewModel A01;
    public final AnonymousClass4VT A02;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1L(numArr, 2130903073);
        AnonymousClass000.A1M(numArr, 2130903074);
        AnonymousClass3Ma.A1S(numArr, 2130903075);
        C17890vO.A1G(numArr, 2130903076);
        A03 = C18070vi.A0O(2130903077, numArr, 4);
    }

    public C112245lA(Context context, MetaAiVoiceSettingViewModel metaAiVoiceSettingViewModel, AnonymousClass4VT r4) {
        C18070vi.A0d(metaAiVoiceSettingViewModel, 1);
        this.A01 = metaAiVoiceSettingViewModel;
        this.A02 = r4;
        this.A00 = context;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0K = C72463Mc.A0K(viewGroup, 0);
        if (i == 0) {
            List list = C42011xT.A0I;
            return new C42011xT(AnonymousClass3MX.A0B(A0K, viewGroup, 2131627465, false));
        } else if (i == 1) {
            List list2 = C42011xT.A0I;
            return new C42011xT(AnonymousClass3MX.A0B(A0K, viewGroup, 2131627464, false));
        } else {
            throw AnonymousClass001.A13("Invalid view type: ", AnonymousClass000.A10(), i);
        }
    }

    public int A0Q() {
        return C108975cc.A02(this.A01.A03);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r13, int i) {
        int i2;
        int i3;
        ColorStateList colorStateList;
        ShapeableImageView shapeableImageView;
        Float valueOf;
        Integer valueOf2;
        ShapeableImageView shapeableImageView2;
        C112795m3 r132 = (C112795m3) r13;
        C18070vi.A0d(r132, 0);
        C20125A8k a8k = (C20125A8k) AnonymousClass3MW.A10(this.A01.A03).get(i);
        boolean z = r132 instanceof C115905w2;
        boolean A1Z = AnonymousClass000.A1Z(a8k.A0E(GraphQLXFBGenAIVoiceCategory.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "category"), GraphQLXFBGenAIVoiceCategory.PUBLIC_FIGURE);
        List list = A03;
        int A0n = AnonymousClass001.A0n(list, i % list.size());
        Context context = this.A00;
        int[] intArray = context.getResources().getIntArray(A0n);
        C18070vi.A0X(intArray);
        int length = intArray.length;
        int i4 = -7829368;
        if (length > 0) {
            i2 = intArray[0];
            if (1 < length) {
                i3 = intArray[1];
            }
            i3 = -7829368;
        } else {
            i2 = -7829368;
            i3 = -7829368;
        }
        int[] A1W = C108945cZ.A1W();
        A1W[0] = i2;
        A1W[1] = i3;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, A1W);
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(1);
        if (A1Z) {
            String A0F = a8k.A0F("thumbnail_url");
            if (A0F == null) {
                A0F = "";
            }
            String A0F2 = a8k.A0F("ring_color");
            if (A0F2 != null) {
                try {
                    i4 = Color.parseColor(A0F2);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (!z) {
                i4 = AnonymousClass1Z2.A06(i4, 20);
            }
            AnonymousClass4VT r2 = this.A02;
            View view = r132.A0H;
            if (z) {
                shapeableImageView = (ShapeableImageView) AnonymousClass3MX.A0C(view, 2131436911);
            } else {
                shapeableImageView = (ShapeableImageView) AnonymousClass3MX.A0C(view, 2131436910);
            }
            r2.A01(gradientDrawable, gradientDrawable, shapeableImageView, A0F);
            colorStateList = ColorStateList.valueOf(i4);
        } else {
            Resources resources = context.getResources();
            if (z) {
                valueOf = Float.valueOf(resources.getDimension(2131169244) / 2.0f);
                if (2 < length) {
                    i4 = intArray[2];
                }
                valueOf2 = Integer.valueOf(i4);
            } else {
                valueOf = Float.valueOf(resources.getDimension(2131169240) / 2.0f);
                if (3 < length) {
                    i4 = intArray[3];
                }
                valueOf2 = Integer.valueOf(i4);
            }
            gradientDrawable.mutate();
            gradientDrawable.setGradientRadius(valueOf.floatValue());
            int intValue = valueOf2.intValue();
            View view2 = r132.A0H;
            if (z) {
                shapeableImageView2 = (ShapeableImageView) AnonymousClass3MX.A0C(view2, 2131436911);
            } else {
                shapeableImageView2 = (ShapeableImageView) AnonymousClass3MX.A0C(view2, 2131436910);
            }
            shapeableImageView.setImageDrawable(gradientDrawable);
            colorStateList = ColorStateList.valueOf(intValue);
            C18070vi.A0X(colorStateList);
        }
        shapeableImageView.setStrokeColor(colorStateList);
    }

    public int getItemViewType(int i) {
        if (C72463Mc.A0A(this.A01.A04) == i) {
            return 0;
        }
        return 1;
    }
}
