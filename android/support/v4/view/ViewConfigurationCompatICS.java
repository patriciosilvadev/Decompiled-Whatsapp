package android.support.v4.view;

import android.view.ViewConfiguration;

class ViewConfigurationCompatICS {
    static boolean hasPermanentMenuKey(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }
}
