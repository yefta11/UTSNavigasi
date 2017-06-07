package xir2n32.remidiuts.telkomschid.utsnavigasi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentFoto#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentFoto extends Fragment {

    public FragmentFoto() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FragmentFoto newInstance() {
        FragmentFoto fragment = new FragmentFoto();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_foto, container, false);
    }

}
