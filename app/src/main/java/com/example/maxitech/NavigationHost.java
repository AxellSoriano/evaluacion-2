package com.example.maxitech;

import androidx.fragment.app.Fragment;

public interface NavigationHost{
    void navigateTo(Fragment fragment, boolean addToBackstack);
}
