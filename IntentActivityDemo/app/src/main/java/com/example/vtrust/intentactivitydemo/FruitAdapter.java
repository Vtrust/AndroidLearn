package com.example.vtrust.intentactivitydemo;

/**
 * Created by vtrust on 18-4-3.
 */


public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(@NonNull Context context, int textViewResourceId, @NonNull List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position);

        //2
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        Log.d("convertView", "LayoutInflater");

        //4
//        View view;
//        if (convertView == null) {
//            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
//            Log.d("convertView", "LayoutInflater");
//        } else {
//            view = convertView;
//        }

        ImageView fruitImage = view.findViewById(R.id.imageView);
        TextView fruitName = view.findViewById(R.id.textView);

        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getFruitName());

        return view;
    }
}
