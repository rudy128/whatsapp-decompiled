package X;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BHt extends WindowInsetsAnimation.Callback {
    public ArrayList A00;
    public List A01;
    public final HashMap A02 = C17880vN.A11();
    public final C25247Cbm A03;

    public BHt(C25247Cbm cbm) {
        super(cbm.A01);
        this.A03 = cbm;
    }

    public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C25247Cbm cbm = this.A03;
        HashMap hashMap = this.A02;
        C25972Cpf cpf = (C25972Cpf) hashMap.get(windowInsetsAnimation);
        if (cpf == null) {
            cpf = C25972Cpf.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, cpf);
        }
        cbm.A02(cpf);
        hashMap.remove(windowInsetsAnimation);
    }

    public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C25247Cbm cbm = this.A03;
        HashMap hashMap = this.A02;
        C25972Cpf cpf = (C25972Cpf) hashMap.get(windowInsetsAnimation);
        if (cpf == null) {
            cpf = C25972Cpf.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, cpf);
        }
        cbm.A03(cpf);
    }

    public WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            ArrayList A14 = AnonymousClass000.A14(list);
            this.A00 = A14;
            this.A01 = Collections.unmodifiableList(A14);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.A03.A00(AnonymousClass1HO.A01((View) null, windowInsets)).A06();
            }
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            HashMap hashMap = this.A02;
            C25972Cpf cpf = (C25972Cpf) hashMap.get(windowInsetsAnimation);
            if (cpf == null) {
                cpf = C25972Cpf.A00(windowInsetsAnimation);
                hashMap.put(windowInsetsAnimation, cpf);
            }
            cpf.A00.A08(windowInsetsAnimation.getFraction());
            this.A00.add(cpf);
        }
    }

    public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C25247Cbm cbm = this.A03;
        HashMap hashMap = this.A02;
        if (hashMap.get(windowInsetsAnimation) == null) {
            hashMap.put(windowInsetsAnimation, C25972Cpf.A00(windowInsetsAnimation));
        }
        C26000CqH A002 = C26000CqH.A00(bounds);
        cbm.A01(A002);
        return A002.A01();
    }
}
