package fr.lteconsulting;

public class TestPlateau
{
	public static void main( String[] args )
	{
		testPuissance4();
		testSaisie();
		testDames();
		testDeBase();
	}

	private static void testPuissance4()
	{
	}

	private static void testSaisie()
	{
		Plateau plateau = new Plateau( 9, 9 );

		int nb = 10;

		while( nb-- > 0 )
		{
			String couleur = Saisie.saisie( "couleur ? (blanc/noir)" );
			int x = Saisie.saisieInt( "saisis l'abscisse" );
			int y = Saisie.saisieInt( "saisis l'ordonnée" );

			Piece piece = null;

			if( "noir".equals( couleur ) )
				piece = new Dame( CouleurNB.Noir );
			else
				piece = new Dame( CouleurNB.Blanc );

			plateau.placer( piece, new Coordonnee( x, y ) );

			plateau.afficher();
		}
	}

	private static void testDames()
	{
		Plateau plateau = new Plateau( 10, 10 );

		for( int i = 0; i < 10; i++ )
		{
			plateau.placer( new Dame( CouleurNB.Noir ), new Coordonnee( i, (1 + i) % 2 ) );
			plateau.placer( new Dame( CouleurNB.Noir ), new Coordonnee( i, 2 + (1 + i) % 2 ) );

			plateau.placer( new Dame( CouleurNB.Blanc ), new Coordonnee( i, 6 + (1 + i) % 2 ) );
			plateau.placer( new Dame( CouleurNB.Blanc ), new Coordonnee( i, 8 + (1 + i) % 2 ) );
		}

		plateau.afficher();
	}

	private static void testDeBase()
	{
		Plateau plateau = new Plateau( 10, 10 );

		plateau.afficher();

		plateau.placer( new Galet(), new Coordonnee( 1, 3 ) );

		plateau.afficher();
	}
}