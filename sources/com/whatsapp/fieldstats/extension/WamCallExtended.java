package com.whatsapp.fieldstats.extension;

import X.C107425Zq;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.ArrayList;
import java.util.List;

public final class WamCallExtended extends WamCall {
    public final List fields = new ArrayList();

    public void addField(WamCallExtendedField wamCallExtendedField) {
        this.fields.add(wamCallExtendedField);
    }

    public void serialize(C107425Zq r4) {
        super.serialize(r4);
        for (WamCallExtendedField wamCallExtendedField : this.fields) {
            r4.CHf(wamCallExtendedField.fieldId, wamCallExtendedField.fieldValue);
        }
    }
}
